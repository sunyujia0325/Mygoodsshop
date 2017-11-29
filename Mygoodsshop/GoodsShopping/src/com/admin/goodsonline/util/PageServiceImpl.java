package com.admin.goodsonline.util;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.admin.goodsonline.entity.Goods;
import com.admin.goodsonline.goods.dao.GoodsDaoImpl;

/**
 * 分页查询 
 * @param currentPage 当前页号：现在显示的页数
 * @param pageSize 每页显示的记录条数
 * @return 封闭了分页信息(包括记录集list)的Bean
 * */
@Repository
public class PageServiceImpl {
	@Resource
	PageDaoImpl pageDaoImpl;
	
	public Page<Goods> queryForPage(int currentPage,int pageSize) {
        // TODO Auto-generated method stub

        Page<Goods> page = new Page<Goods>();        
        //总记录数
        int allRow = GoodsDaoImpl.getAllRowCount();
        //当前页开始记录
        int offset = page.countOffset(currentPage,pageSize);  
        //分页查询结果集
        List<Goods> list = GoodsDaoImpl.queryForPage(offset, pageSize); 

        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);
        
        return page;
    }

}
