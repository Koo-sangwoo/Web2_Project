package com.shopping.web2.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.HomeController;
import com.shopping.web2.model.ProductService;
import com.shopping.web2.vo.ProductVO;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public ModelAndView productList(@RequestParam String category) {
		List<ProductVO> lists = service.productLists(category);
		ModelAndView mav = new ModelAndView("product/productList");
		mav.addObject("productlists",lists);
		return mav;
	}

}