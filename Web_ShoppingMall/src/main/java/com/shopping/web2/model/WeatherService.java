package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import com.shopping.web2.vo.ProductVO;

public interface WeatherService {

	List<ProductVO> weatherList(Map<String, Object> map);

}
