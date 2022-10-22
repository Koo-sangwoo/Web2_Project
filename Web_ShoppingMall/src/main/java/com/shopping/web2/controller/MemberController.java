package com.shopping.web2.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.controller.MemberController;
import com.shopping.web2.model.MemberService;
import com.shopping.web2.vo.MemberVO;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public ModelAndView memberListView(Locale locale, Model model) {		
		ModelAndView mav = new ModelAndView("member/memberList");
		return mav; 				
	}
	@RequestMapping(value = "/memberList", method = RequestMethod.POST)
	public ModelAndView memberListData(@RequestParam String search, Locale locale, Model model) {
		List<MemberVO> lists =  service.list(search);
		logger.info("#########" + lists);
		ModelAndView mav = new ModelAndView("member/memberList");
		mav.addObject("lists",lists);
		return mav; 				
	}
}
