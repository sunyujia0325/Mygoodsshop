package com.admin.goodsonline.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.CategoryDao;
import com.admin.goodsonline.entity.Category;
import com.admin.goodsonline.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    public List<Category> getCategory() {
        return categoryDao.findAll();
    }
}
