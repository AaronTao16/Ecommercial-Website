package com.yit.ecommercial.products;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yit.ecommercial.products.dao")
@SpringBootApplication
public class ProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

}
