package com.admin.goodsonline.util;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.goodsonline.entity.Goods;

/**
 * 分页查询
 * @param hql 查询的条件
 * @param offset 开始记录
 * @param length 一次查询几条记录
 * @return 返回查询记录集合
 */
@Repository
public class PageDaoImpl {
	@Resource
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Goods> queryForPage(int offset, int length) {
        // TODO Auto-generated method stub
        List<Goods> entitylist=null;
        try{
        	Query query= this.sessionFactory.getCurrentSession().createQuery("from Goods");
            query.setFirstResult(offset);
            query.setMaxResults(length);
            entitylist = query.list();
            
        }catch(RuntimeException re){
            throw re;
        }
        
        return entitylist;
	}
	
	public int getAllRowCount() {
		// TODO Auto-generated method stub
		Query query= this.sessionFactory.getCurrentSession().createQuery("select count(*) from Goods as goodsId");
		int count = (int) query.uniqueResult();
		
		return count;
	}

}
