package com.retail.foodgroceryservice.product;

import com.retail.foodgroceryservice.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdcutController {

    @Autowired
    public ProductService productService;

    public ProdcutController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> GetProducts()
    {
        return new ArrayList<Product>();
    }
}
