package com.admin.goodsonline.util;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.*;
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
	private Session session;

	@SuppressWarnings("unchecked")
	public List<Goods> queryForPage(int offset, int length) {
        // TODO Auto-generated method stub
        List<Goods> entitylist=null;
        try{
            Query query = session.createQuery("from goods");
            query.setFirstResult(offset);
            query.setMaxResults(length);
            entitylist = query.list();
            
        }catch(RuntimeException re){
            throw re;
        }
        
        return entitylist;
	}

}
