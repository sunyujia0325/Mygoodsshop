package com.admin.goodsonline.goods.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.entity.Goods;
import com.admin.goodsonline.goods.dao.GoodsDaoImpl;

@Service
@Transactional(readOnly=true)
public class GoodsServiceImpl {
	
	@Resource
	private GoodsDaoImpl goodsDaoImpl;
	
	public List<Goods> listAll(){
		return this.goodsDaoImpl.findAll();
	}

}
