package com.shopping.web2.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.security.auth.callback.ConfirmationCallback;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.HomeController;
import com.shopping.web2.model.CartService;
import com.shopping.web2.vo.CartVO;

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

	@RequestMapping(value = "/cartUpdate", method = RequestMethod.GET)
	public ModelAndView cartUpdate(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		service.update(map);
		mav.setViewName("redirect:/cart?memberId=asdf");
		return mav;
	}

	@RequestMapping(value = "/cartDelete", method = RequestMethod.GET)
	public ModelAndView cartDelete(@RequestParam String cartId) {
		ModelAndView mav = new ModelAndView();
		service.delete(cartId);
		mav.setViewName("redirect:/cart?memberId=asdf");
		return mav;
	}

	@RequestMapping(value = "/cartSizeUpdate", method = RequestMethod.POST)
	public ModelAndView cartSizeUpdate(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
			boolean isUpdateSize = service.updateSize(map);
			if (isUpdateSize) {
			mav.addObject("msg", "�닔�젙�릺�뿀�뒿�땲�떎.");
		} else {
			mav.addObject("msg", "�긽�뭹�씠 �씠誘� �옣諛붽뎄�땲�뿉 �엳�뒿�땲�떎.");
		}
		mav.setViewName("cart/cartUpdate");

		return mav;
	}

	@RequestMapping(value = "/orderCart", method = RequestMethod.POST)
	public ModelAndView orderCart(@RequestParam String[] cartId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartIds", cartId);
		mav.setViewName("cart/order");

		return mav;
	}
	
	@RequestMapping(value = "/addCart", method = RequestMethod.POST)
	public ModelAndView addCart(@ModelAttribute CartVO vo) {
		ModelAndView mav = new ModelAndView();
		service.addCart(vo);
		mav.setViewName("redirect:/cart?memberId=asdf");
		return mav;
		
	}
	

}