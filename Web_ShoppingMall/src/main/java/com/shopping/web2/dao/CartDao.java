package com.shopping.web2.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.web2.vo.CartVO;


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
	
	public List<Map<String, Object>> duplicateList(Map<String, Object> map) {
		return sqltemplate.selectList("cart.duplicateList", map);
	}
	
	public void addCart(Map<String, Object> map) {
		sqltemplate.insert("cart.insertCart",map);
	}
	
	public int countCart(String productId, String memberId,String size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productId", productId);
		map.put("memberId",memberId);
		map.put("size", size);
		return sqltemplate.selectOne("cart.countCart",map);
		
	}
	public void updateCart(Map<String, Object> map) {
		sqltemplate.update("cart.updateCart",map);
	}
	
}