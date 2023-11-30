package nsc.spring.apilab.service;

import nsc.spring.apilab.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
