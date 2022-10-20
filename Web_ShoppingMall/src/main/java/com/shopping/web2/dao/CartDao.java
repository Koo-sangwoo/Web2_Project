package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CartDao {

	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	public List<Map<String, Object>> list(String memberId) {
		return sqltemplate.selectList("cart.list", memberId);
	}
	
	public void update(Map<String, Object> map) {
		sqltemplate.update("cart.update",map);
	}

	public void delete(String cartId) {
		sqltemplate.delete("cart.delete", cartId);
		
	}

	public void updateSize(Map<String, Object> map) {
		sqltemplate.update("cart.updateSize",map);
		
	}
	
}
