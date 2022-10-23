package com.shopping.web2.controller;




import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.model.OrderService;


@Controller
public class OrderController {
	@Autowired
	private OrderService service;

	@RequestMapping(value = "/order/order", method = RequestMethod.GET)
	public ModelAndView cartlists(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView("/order");
		mav.addObject("orderinfo", service.order_info(map));
		return mav;
	}
	

}
