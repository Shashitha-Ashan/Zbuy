package coml.ashan.product.service;

import coml.ashan.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService (ProductRepo productRepo) {
        this.productRepo = productRepo;

    }
}
