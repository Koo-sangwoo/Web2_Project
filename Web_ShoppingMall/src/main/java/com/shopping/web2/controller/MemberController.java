package com.shopping.web2.controller;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.Session;
import com.shopping.web2.controller.MemberController;
import com.shopping.web2.model.MemberService;
import com.shopping.web2.vo.MemberVO;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ResponseBody
@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService service;

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("member/join");
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map<String,Object> map) {
		try {
			ModelAndView mav = new ModelAndView();
			boolean isCreated = service.create(map);
			if(isCreated) {
				mav.addObject("msg", "회원가입을 축하합니다.");
				mav.setViewName("redirect:/");
			}else {
				mav.addObject("msg", "회원가입 실패. 다시 시도해주세요.");
				mav.setViewName("redirect:/join");
			}
			return mav;
		} catch (DuplicateKeyException e) {
				ModelAndView mav = new ModelAndView("/member/join_fail");
				mav.addObject("msg", "아이디가 중복되었습니다.");
				return mav;
			}
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("member/login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, Object> map, HttpSession session)
	{
		ModelAndView mav = new ModelAndView("member/login");
		Map<String, Object> result = service.loginCheck(map);
			if (result != null) {
				session.setAttribute("member", result);
				mav.setViewName("redirect:/");
			} else {
				session.setAttribute("member", null);
				mav.addObject("msg", "로그인 실패");
				mav.addObject("url", "reidrect");
//				mav.setViewName("redirect:/login"); 	
			}
			return mav;
	}
		   
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
			service.logout(session);
			mav.setViewName("redirect:/"); 
			return mav;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String,Object> map, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> detailMap = service.selectDetail(map);
		session.getAttribute("memberId");
		mav.addObject("data",detailMap);
		mav.setViewName("/member/detail");	
		return mav;
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String,Object> map, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> detailMap = service.selectDetail(map);
//		session.getAttribute("memberId");
		mav.addObject("data", detailMap);
		mav.setViewName("/member/update");
		return mav;
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String,Object> map, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		map.put("memberId", map.get("id")); //id값을 memberId로 돌림
		session.setAttribute("member", map);
			service.update(map);
			mav.addObject("msg", "변경되었습니다.");
			mav.setViewName("/member/detail");
		return mav;
	}
	
	@RequestMapping(value = "/memberList")
	public ModelAndView list(@RequestParam Map<String,Object> map, HttpSession session) {
		ModelAndView mav = new ModelAndView("/member/memberList");
		session.getAttribute("memberId");
		mav.addObject("memberlists", service.list(map));
		return mav;
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
		public ModelAndView delete(@RequestParam Map<String,Object> map, HttpSession session) {
		session.getAttribute("memberId");
		ModelAndView mav = new ModelAndView();
		boolean isSuccessDelete = (service.delete(map) == 1);
		if(isSuccessDelete) {
			service.logout(session);
			mav.setViewName("redirect:/");
		}else {
			mav = this.detail(map, session);
		}
		return mav;
		}
	
}
