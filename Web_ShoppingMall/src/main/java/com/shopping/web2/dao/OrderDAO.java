package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.web2.vo.OrderVO;

import net.sf.log4jdbc.log.log4j2.message.SqlTimingOccurredMessage;

@Repository
public class OrderDAO {
	
	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	
	public List<Map<String,Object>> order_info(Map<String,Object> map) {
		
		return sqltemplate.selectList("order.order_info",map);
	}
	
public List<Map<String,Object>> order_list(Map<String,Object> map) {
		
		return sqltemplate.selectList("order.orderlist",map);
	}

public void insertOrder(OrderVO vo) {
	sqltemplate.insert("order.insertOrder", vo);
	
}

public List<Map<String,Object>> customer_info(Map<String,Object> map) {
	
	return sqltemplate.selectList("order.customer_info",map);
}

	
}