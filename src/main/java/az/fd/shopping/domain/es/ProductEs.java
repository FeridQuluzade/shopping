package az.fd.shopping.domain.es;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {
    private String id;
    private String name;
    private String code;
    private String description;
    private CompanyEs seller;
    private String feature;
    private BigDecimal price;
    private CategoryEs categoryId;
    private Boolean active;
}
