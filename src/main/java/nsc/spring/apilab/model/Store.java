package nsc.spring.apilab.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("store")
@Data
public class Store {
    @Id
    private String id;

    private String name;

    private String address;
}
