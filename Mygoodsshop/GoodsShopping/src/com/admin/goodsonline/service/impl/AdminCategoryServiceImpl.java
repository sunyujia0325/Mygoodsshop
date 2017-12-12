package com.admin.goodsonline.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.CategoryDao;
import com.admin.goodsonline.entity.Category;
import com.admin.goodsonline.service.AdminCategoryService;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("adminCategoryService")
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Resource
    private CategoryDao categoryDao;

    public void addCategory(Category category) {
        categoryDao.save(category);
    }

    public void deleteCategory(Integer cid) {
        categoryDao.delete(cid);
    }

    public void updateCategory(Category category) {
        categoryDao.update(category);
    }

    public Integer countCategory() {
        Integer count = categoryDao.countCategory();
        return (count % 10 == 0 ? (count / 10) : (count / 10 + 1));
    }

    public Category findCategory(Integer cid) {
        return categoryDao.findOne(cid);
    }

    public List<Category> findCategory() {
        return categoryDao.findAll();
    }

    public List<Category> listCategory(Integer page) {
        return categoryDao.findAll(page);
    }

}
