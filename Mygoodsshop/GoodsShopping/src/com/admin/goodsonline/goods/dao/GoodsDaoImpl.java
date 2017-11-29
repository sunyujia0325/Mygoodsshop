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
	
	@SuppressWarnings("unchecked")
	public List<Goods> findAll(){
		Query q= this.sessionFactory.getCurrentSession().createQuery("from goods");
		return q.list();
	}

	public static int getAllRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static List<Goods> queryForPage(int offset, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
