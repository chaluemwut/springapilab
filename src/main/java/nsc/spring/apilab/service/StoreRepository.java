package nsc.spring.apilab.service;

import nsc.spring.apilab.model.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String> {
}
