package nsc.spring.apilab.controller;

import nsc.spring.apilab.model.Product;
import nsc.spring.apilab.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("save")
    public Object save(Product product){
        return productRepository.save(product);
    }

    @GetMapping("/list")
    public Object list(){
        return productRepository.findAll();
    }

}
