package az.fd.shopping.repository.mongo;

import az.fd.shopping.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice , String> {
}
