package com.admin.goodsonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.goodsonline.service.CategoryService;
import com.admin.goodsonline.service.ProductService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("p")
public class IndexController {
	@Resource
    private CategoryService categoryService;

    @Resource
    private ProductService productService;

    @RequestMapping("/index")
    public String showIndex(Map<String, Object> map, HttpSession session) {
        //把所有的一级分类都存入到session中
        session.setAttribute("cList", categoryService.getCategory());

        //把最新的10条商品存放到map集合中
        map.put("nList", productService.findNew());
        //把最热的10条商品添加到map集合中
        map.put("hList", productService.findHot());

        return "jsp/index";
    }
}
