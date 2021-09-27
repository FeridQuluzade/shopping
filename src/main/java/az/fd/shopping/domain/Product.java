package az.fd.shopping.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collation = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;
    private String feature;
    private BigDecimal price;
    private String categoryId;
    private List<ProductImage> productImage;
    private  Boolean active;
}
