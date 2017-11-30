package com.admin.goodsonline.goods.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.goodsonline.entity.Goods;

@Repository
public class GoodsDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	//全部产品
	@SuppressWarnings("unchecked")
	public List<Goods> findAll(){
		Query q= this.sessionFactory.getCurrentSession().createQuery("from Goods");
		return q.list();
	}
	//国产水果
	@SuppressWarnings("unchecked")
	public List<Goods> find1(){
		Query q= this.sessionFactory.getCurrentSession().createQuery("from Goods where goodsTypeId = '1'");
		return q.list();
	}
	//进口水果
	@SuppressWarnings("unchecked")
	public List<Goods> find2(){
		Query q= this.sessionFactory.getCurrentSession().createQuery("from Goods where goodsTypeId = '2'");
		return q.list();
	}
	//新鲜时蔬
	@SuppressWarnings("unchecked")
	public List<Goods> find3(){
		Query q= this.sessionFactory.getCurrentSession().createQuery("from Goods where goodsTypeId = '3'");
		return q.list();
	}

}
