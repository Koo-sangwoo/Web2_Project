package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.OrderDAO;

@Service
public class OrderServiceImple implements OrderService {
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public List<Map<String, Object>> order_info(Map<String, Object> map) {
		return dao.order_info(map);
	}

}
