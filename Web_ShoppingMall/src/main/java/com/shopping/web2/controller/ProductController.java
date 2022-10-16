package com.shopping.web2.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public ModelAndView product(Locale locale, Model model) {
		ModelAndView mav = new ModelAndView("product/productList");
		return mav;
	}

}