package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
	
	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	
	public List<Map<String,Object>> order_info(Map<String,Object> map) {
		
		return sqltemplate.selectList("order.order_info",map);
	}
}
