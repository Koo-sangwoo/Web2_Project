package com.shopping.web2.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.security.auth.callback.ConfirmationCallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.HomeController;
import com.shopping.web2.model.CartService;

@Controller
public class CartController {
	@Autowired
	private CartService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cartList(@RequestParam String memberId) {
		List<Map<String, Object>> lists = service.list(memberId);
		ModelAndView mav = new ModelAndView("cart/cartList");
		mav.addObject("cartlists", lists);
		return mav;
	}

	@RequestMapping(value = "/cartUpdate", method = RequestMethod.POST)
	public ModelAndView cartUpdate(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		service.update(map);
		mav.setViewName("redirect:/cart?memberId=asdf");
		return mav;
	}

	@RequestMapping(value = "/cartDelete", method = RequestMethod.POST)
	public ModelAndView cartDelete(@RequestParam String cartId) {
		ModelAndView mav = new ModelAndView();
		service.delete(cartId);
		mav.setViewName("redirect:/cart?memberId=asdf");
		return mav;}
		
		@RequestMapping(value = "/cartSizeUpdate", method = RequestMethod.POST)
		public ModelAndView cartSizeUpdate(@RequestParam Map<String, Object> map) {
			ModelAndView mav = new ModelAndView();
			service.updateSize(map);
			mav.setViewName("redirect:/cart?memberId=asdf");
			return mav;
		}
		
		

//	}

}