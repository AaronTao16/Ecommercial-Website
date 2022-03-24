package com.yit.ecommercial.products.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yit.common.utils.PageUtils;
import com.yit.common.utils.Query;

import com.yit.ecommercial.products.dao.CategoryDao;
import com.yit.ecommercial.products.entity.CategoryEntity;
import com.yit.ecommercial.products.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // step 1, find all categories
        // baseMapper in ServiceImpl is categoryDao
        List<CategoryEntity> entities = baseMapper.selectList(null); // find without condition

        // step 2, list to tree
        // find level 1
//        List<CategoryEntity> level1Cat = entities.stream().filter((categoryEntity) -> {
//           return categoryEntity.getParentCid() == 0;
//        }).collect(Collectors.toList());

        // set child cat for level 1
        List<CategoryEntity> level1Cat = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu) ->{
            menu.setSubCatList(getSubCategories(menu, entities));
            return menu;
        }).sorted((menu1, menu2) ->{
            return (menu1.getSort() == null ? 0: menu1.getSort()) - (menu2.getSort() == null ? 0: menu2.getSort());
        }).collect(Collectors.toList());

        return level1Cat;
    }

    private List<CategoryEntity> getSubCategories(CategoryEntity parent, List<CategoryEntity> data){
        return data.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(parent.getCatId())
        ).map(categoryEntity -> {
            // find subCatList  -- recursion
            categoryEntity.setSubCatList(getSubCategories(categoryEntity, data));
            return categoryEntity;
        }).sorted((subCat1, subCat2) ->{
            return subCat1.getSort() - subCat2.getSort();
        }).collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> list){
        // TODO 1. check if menu is occupied

        // logical delete (mark delete)
        baseMapper.deleteBatchIds(list);
    }

}