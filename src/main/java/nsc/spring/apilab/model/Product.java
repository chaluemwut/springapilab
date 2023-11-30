package nsc.spring.apilab.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
@Data
public class Product {
    @Id
    private String id;

    private String name;

    private int numberOfItem;

}
