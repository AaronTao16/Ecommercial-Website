package com.yit.ecommercial.products.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yit.ecommercial.products.entity.CategoryEntity;
import com.yit.ecommercial.products.service.CategoryService;
import com.yit.common.utils.PageUtils;
import com.yit.common.utils.R;



/**
 * 商品三级分类
 *
 * @author YiTao
 * @email yit36@pitt.edu
 * @date 2021-07-04 10:22:50
 */
@RestController
@RequestMapping("products/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * find all the categories and its children, display in tree
     */
    @RequestMapping("list/tree")
    public R list(){
        List<CategoryEntity> categoryEntityList = categoryService.listWithTree(); // find all branches

        return R.ok().put("data", categoryEntityList);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){

        // check if current cat is occupied
        categoryService.removeMenuByIds(Arrays.asList(catIds));

//        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
