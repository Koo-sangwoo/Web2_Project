package com.shopping.web2.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView productList() {
		List<ProductVO> lists = service.productListAll();
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("productlists",lists);
		return mav;
	}
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public ModelAndView productList(@RequestParam Map<String, Object> map) {
		List<ProductVO> lists = service.productLists(map);
		ModelAndView mav = new ModelAndView("product/productList");
		mav.addObject("productlists",lists);
		return mav;
	}
	
	@RequestMapping(value="/product/detail", method = RequestMethod.GET)
	public ModelAndView productDetail(@RequestParam Map<String, Object> map) {
		List<ProductVO> lists = service.productDetail(map);
		ModelAndView mav = new ModelAndView("product/productDetail");
		mav.addObject("productdetail",lists);
		return mav;
	}
	
	@RequestMapping(value = "/product/search",method = RequestMethod.POST)
	public ModelAndView productSearch(@RequestParam String search,HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		System.out.println( request.getParameter("search"));
		List<ProductVO> searchlists = service.productSearch(search);
		ModelAndView mav = new ModelAndView("product/productSearch");
		mav.addObject("productlists",searchlists);
		return mav;
	}
	
	@RequestMapping(value = "/product/searchdetail",method = RequestMethod.GET)
	public ModelAndView productSearch(@RequestParam Map<String, Object> map) {
		List<ProductVO> searchlists = service.productSearchDetail(map);
		ModelAndView mav = new ModelAndView("product/productSearch");
		mav.addObject("productlists",searchlists);
		return mav;
	}

}