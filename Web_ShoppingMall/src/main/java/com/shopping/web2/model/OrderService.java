package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

public interface OrderService {
	public List<Map<String,Object>> order_info(Map<String, Object> map);
	
	
	public List<Map<String,Object>> orderlist(Map<String, Object> map);


}

