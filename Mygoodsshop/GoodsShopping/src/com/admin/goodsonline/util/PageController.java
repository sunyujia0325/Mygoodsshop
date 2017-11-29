package com.admin.goodsonline.util;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.goodsonline.entity.Goods;

@Repository
public class PageController {
	@Resource
	PageServiceImpl pageServiceImpl;
	
	@RequestMapping(value = "/showAll.do")
    public String findAllCourse(HttpServletRequest request,
            HttpServletResponse response) {
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }
            Page<Goods> page = pageServiceImpl.queryForPage(Integer.valueOf(pageNo), 10);
            request.setAttribute("page", page);
            List<Goods> course = page.getList();
            request.setAttribute("courses", course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "course/course_list";
    }

}
