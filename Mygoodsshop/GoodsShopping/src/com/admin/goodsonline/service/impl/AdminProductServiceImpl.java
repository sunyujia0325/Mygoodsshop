package com.admin.goodsonline.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.ProductDao;
import com.admin.goodsonline.entity.Product;
import com.admin.goodsonline.service.AdminProductService;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("adminProductService")
public class AdminProductServiceImpl implements AdminProductService {

    @Resource
    private ProductDao productDao;

    public Integer countProduct() {
        Integer count = productDao.CountProduct();
        return (count % 8 == 0 ? (count / 8) : (count / 8 + 1));
    }

    public void deleteProduct(Product product) {
        productDao.delete(product);
    }

    public Product findProduct(Integer pid) {
        return productDao.findOne(pid);
    }

    public List<Product> listProduct(Integer page) {
        return productDao.findAll(page);
    }

    public void saveProduct(Product product) {
        productDao.save(product);
    }

    public void updateProduct(Product product) {
        productDao.update(product);
    }

}
