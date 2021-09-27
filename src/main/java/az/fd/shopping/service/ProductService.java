package az.fd.shopping.service;

import az.fd.shopping.model.ProductResponse;
import az.fd.shopping.model.ProductSaveRequest;
import az.fd.shopping.repository.es.ProductEsRepository;
import az.fd.shopping.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;

    List<ProductResponse> getByPaging(Pageable pageable) {
        // 1 - ES den sorgula
        // 2 - Calculated fieldleri isle
        // 3 - redisten ehtiyyac  hisselerini getir
        // 4 - response obyektine cevir
        return null;
    }

    ProductResponse save(ProductSaveRequest productSaveRequest) {
        //1- mongoya yaz
        //2 - ES update ele
        //3 - Redis update
        //4 - ES cavab gozle
        //5 - repsonse obyektine cevir
        return null;
    }
}
