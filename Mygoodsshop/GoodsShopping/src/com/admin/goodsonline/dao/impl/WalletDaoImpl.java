package com.admin.goodsonline.dao.impl;

import org.springframework.stereotype.Repository;

import com.admin.goodsonline.dao.WalletDao;
import com.admin.goodsonline.entity.Wallet;

@Repository("walletDao")
@SuppressWarnings("all")
public class WalletDaoImpl extends BaseDaoImpl<Wallet> implements WalletDao {

}
