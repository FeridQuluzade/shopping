package az.fd.shopping.service;

import az.fd.shopping.domain.MoneyType;
import az.fd.shopping.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceService {
    private final ProductPriceRepository productPriceRepository;

    public BigDecimal getByMoneyTYpe(String id, MoneyType usd) {
        return BigDecimal.TEN;
    }
}
