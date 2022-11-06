package com.shopping.web2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.model.BoardService;
import com.shopping.web2.vo.BoardVO;

@Controller
public class BoardrController {
	private static final Logger logger = LoggerFactory.getLogger(BoardrController.class);
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public ModelAndView memberListView(@RequestParam(defaultValue = "1") String num, Locale locale, Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pernum", 5);		
		map.put("num", Integer.valueOf(num));
		List<BoardVO> lists =  service.list(map);
		ModelAndView mav = new ModelAndView("/board/boardlist");
		mav.addObject("lists",lists);
		return mav; 				
	}
//	@RequestMapping(value = "/memberList", method = RequestMethod.POST)
//	public ModelAndView memberListData(@RequestParam String search, Locale locale, Model model) {
//		List<MemberVO> lists =  service.list(search);
//		logger.info("#########" + lists);
//		ModelAndView mav = new ModelAndView("member/memberList");
//		mav.addObject("lists",lists);
//		return mav; 				
//	}
}
