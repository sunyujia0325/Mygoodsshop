package com.admin.goodsonline.dao;

import com.admin.goodsonline.entity.Admin;

public interface AdminDao extends BaseDao<Admin> {

    public Admin findByAdminnameAndPassword(String username, String password);

    public Admin findOne(Integer aid);
}