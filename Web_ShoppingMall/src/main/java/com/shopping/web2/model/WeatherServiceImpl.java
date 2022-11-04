package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.WeatherDao;
import com.shopping.web2.vo.ProductVO;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherDao dao;
	
	@Override
	public List<ProductVO> weatherList(Map<String, Object> map) {
		
		return dao.list(map);
	}

}
