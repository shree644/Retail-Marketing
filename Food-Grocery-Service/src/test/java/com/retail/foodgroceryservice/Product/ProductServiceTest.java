package com.retail.foodgroceryservice.Product;

import com.retail.foodgroceryservice.product.ProductService;
import com.retail.foodgroceryservice.product.models.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProductService.class})
public class ProductServiceTest {
    @Autowired
    public ProductService productService;

    @Test
    public void shouldReturnAllProducts()
    {
        List<Product> products = new ArrayList<Product>();
        List<Product> productresults = productService.getProducts();

        assertThat(productresults).isEqualTo(products);
    }

}
