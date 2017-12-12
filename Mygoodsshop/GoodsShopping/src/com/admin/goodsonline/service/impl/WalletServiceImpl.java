package com.admin.goodsonline.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.WalletDao;
import com.admin.goodsonline.entity.Wallet;
import com.admin.goodsonline.service.WalletService;

import javax.annotation.Resource;

@Transactional
@Service("walletService")
public class WalletServiceImpl implements WalletService {
    @Resource
    private WalletDao walletDao;

    //修改电子钱包的值
    public void update(Wallet wallet) {
        walletDao.update(wallet);
    }

}
