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
	@RequestMapping("/produ")
	public String list(Model model){
		List<Goods> list=this.goodsServiceImpl.listAll();
		model.addAttribute("list", list);
		return "float/produ";
	}
	@RequestMapping("/Domesticfruit")
	public String list1(Model model){
		List<Goods> list=this.goodsServiceImpl.list1();
		model.addAttribute("list", list);
		return "float/Domesticfruit";
	}
	@RequestMapping("/importedfruit")
	public String list2(Model model){
		List<Goods> list=this.goodsServiceImpl.list2();
		model.addAttribute("list", list);
		return "float/importedfruit";
	}
	@RequestMapping("/FreshVegetable")
	public String list3(Model model){
		List<Goods> list=this.goodsServiceImpl.list3();
		model.addAttribute("list", list);
		return "float/FreshVegetable";
	}

}
