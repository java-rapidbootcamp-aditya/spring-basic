package com.rapidtech.srpingdasar.config;

import com.rapidtech.srpingdasar.model.Category;
import com.rapidtech.srpingdasar.model.Product;
import com.rapidtech.srpingdasar.model.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ProductConfigurationTest {
    private static ApplicationContext context;
    @BeforeEach
    void setUp() {
        context =new AnnotationConfigApplicationContext(DependencyInjection.class);

    }

    @Test
    void productTest() {
        Product product = context.getBean("product", Product.class);
        Category category = context.getBean("category", Category.class);
        Assertions.assertSame(product,category);

    }
}