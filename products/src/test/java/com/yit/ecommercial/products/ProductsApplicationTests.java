package com.yit.ecommercial.products;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yit.ecommercial.products.entity.BrandEntity;
import com.yit.ecommercial.products.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductsApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setName("Hua Wei");
//        brandService.save(brandEntity);
//        System.out.println("save success");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach(System.out::println);
//        list.forEach((item)->{
//            System.out.println(item);
//        });
    }

}
