package nsc.spring.apilab.controller;

import nsc.spring.apilab.model.Product;
import nsc.spring.apilab.model.Store;
import nsc.spring.apilab.service.ProductRepository;
import nsc.spring.apilab.service.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @PostMapping
    public Object save(@RequestBody Store store){
        return storeRepository.save(store);
    }

    @GetMapping
    public Object list(){
        return storeRepository.findAll();
    }

}
