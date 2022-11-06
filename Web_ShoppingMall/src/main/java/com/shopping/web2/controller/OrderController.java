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
import com.shopping.web2.vo.OrderVO;


@Controller
public class OrderController {
	@Autowired
	private OrderService service;

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView cartlists(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView("/order/order");
		mav.addObject("orderinfo", service.order_info(map));
		mav.addObject("customer_info",service.customer_info(map));
		return mav;
	}
	
	@RequestMapping(value = "/orderlist", method = RequestMethod.GET)
	public ModelAndView orderlists(@RequestParam Map<String,Object> map,@ModelAttribute OrderVO vo) {
		ModelAndView mav = new ModelAndView("/order/orderlist");
		mav.addObject("orderlist", service.orderlist(map));
		mav.addObject("orderinfo", service.order_info(map));
		System.out.println("///////////////////////////////////////////////");
		return mav;
	}
	
	@RequestMapping(value = "/insertOrder", method = RequestMethod.GET)
	public ModelAndView insertOrder(@ModelAttribute OrderVO vo) {
		ModelAndView mav = new ModelAndView();
		service.insertOrder(vo);
		mav.setViewName("redirect:/order?memberId="+vo.getMemberId());
		return mav;
		
	}
	
	

}
