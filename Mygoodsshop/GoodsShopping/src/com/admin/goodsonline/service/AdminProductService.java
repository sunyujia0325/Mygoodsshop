package com.admin.goodsonline.service;

import java.util.List;

import com.admin.goodsonline.entity.Product;

public interface AdminProductService {
    //分页查询商品
    public List<Product> listProduct(Integer page);

    //查询商品的页数
    public Integer countProduct();

    //保存商品
    public void saveProduct(Product product);

    //查找某个具体的商品
    public Product findProduct(Integer pid);

    //删除商品
    public void deleteProduct(Product product);

    //修改商品
    public void updateProduct(Product product);
}
