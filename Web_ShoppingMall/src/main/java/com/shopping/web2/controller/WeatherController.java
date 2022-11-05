package com.shopping.web2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.web2.model.WeatherService;
import com.shopping.web2.vo.ProductVO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService service;
	
	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public ModelAndView weather() {
		ModelAndView mav = new ModelAndView("weather/weather");
		return mav;
	}
	
	
	@RequestMapping(value = "/addLists", method= RequestMethod.POST)
	@ResponseBody	
	public List<ProductVO> weatherlists(@RequestBody Map<String, Object> param){
		List<ProductVO> lists = service.weatherList(param);
		return lists;
	}

}
