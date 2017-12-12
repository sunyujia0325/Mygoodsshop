package com.admin.goodsonline.service.impl;


import com.admin.goodsonline.utils.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.UserDao;
import com.admin.goodsonline.entity.User;
import com.admin.goodsonline.service.UserService;

import javax.annotation.Resource;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User active(String code) {
        return userDao.findByCode(code);
    }

    public User findUserByUsernameAndPassword(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public User existUser(String userName) {
        return userDao.findByUsername(userName);
    }

    public void register(User user) {
        user.setState(1);
        String code = UUIDUtils.getUUID() + UUIDUtils.getUUID();
        user.setCode(code);
        userDao.save(user);
    }

    public void update(User user) {
        userDao.update(user);

    }

    public User findByUid(Integer uid) {
        return userDao.findOne(uid);
    }

}