package com.rapidtech.srpingdasar.config;

import com.rapidtech.srpingdasar.model.Category;
import com.rapidtech.srpingdasar.model.Product;
import org.springframework.context.annotation.Bean;

public class ProductConfiguration {
    @Bean
    public Product product(){
        return new Product();
    }
    @Bean
    public Category category(){
        return new Category();
    }
}
