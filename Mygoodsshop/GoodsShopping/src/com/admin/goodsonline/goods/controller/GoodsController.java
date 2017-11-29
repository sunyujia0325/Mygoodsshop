package com.admin.goodsonline.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.goodsonline.goods.service.GoodsServiceImpl;
import com.admin.goodsonline.entity.Goods;
@Controller
@RequestMapping("goods")
public class GoodsController {
	@Resource
	private GoodsServiceImpl goodsServiceImpl;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Goods> list=this.goodsServiceImpl.listAll();
		model.addAttribute("list", list);
		return "list";
	}

}
