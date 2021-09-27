package az.fd.shopping.service;

import az.fd.shopping.domain.MoneyType;
import az.fd.shopping.domain.es.ProductEs;
import az.fd.shopping.model.ProductResponse;
import az.fd.shopping.model.ProductSaveRequest;
import az.fd.shopping.model.ProductSellerResponse;
import az.fd.shopping.repository.es.ProductEsRepository;
import az.fd.shopping.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;


@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ProductImageService productImageService;

    public Flux<ProductResponse> getAll() {
        return productEsRepository.findAll().map(this::maptoDto);
    }


    ProductResponse save(ProductSaveRequest productSaveRequest) {
        //1- mongoya yaz
        //2 - ES update ele
        //3 - Redis update
        //4 - ES cavab gozle
        //5 - repsonse obyektine cevir
        return null;
    }


    private ProductResponse maptoDto(ProductEs productEs) {
        BigDecimal price = productPriceService.getByMoneyTYpe(productEs.getId(), MoneyType.USD);
        return ProductResponse.builder()
                .price(price)
                .name(productEs.getName())
                .features(productEs.getFeature())
                .id(productEs.getId())
                .description(productEs.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(productEs.getId()))
                .categoryId(productEs.getCategoryId().getId())
                .available(productAmountService.getProductId(productEs.getId()))
                .freeDelivery(productDeliveryService.freeDeliveryCheck(productEs.getId(), price))
                .moneyType(MoneyType.EUR)
                .image(productImageService.getProductMainImage(productEs.getId()))
                .seller(ProductSellerResponse
                        .builder()
                        .id(productEs.getSeller().getId())
                        .name(productEs.getSeller().getName()).build())
                .build();
    }

}
