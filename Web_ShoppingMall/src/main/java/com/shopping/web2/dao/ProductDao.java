package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.web2.vo.MemberVO;
import com.shopping.web2.vo.ProductVO;

@Repository
public class ProductDao {
	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	public List<ProductVO> list(Map<String, Object> map){
		return sqltemplate.selectList("product.list",map);
	}
	
}
