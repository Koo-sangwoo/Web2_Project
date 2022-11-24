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
	
	public List<ProductVO> list(){
		return sqltemplate.selectList("product.listAll");
	}
	
	public List<ProductVO> list(Map<String, Object> map){
		return sqltemplate.selectList("product.list",map);
	}
	
	public List<ProductVO> searchlists(String search) {
		// TODO Auto-generated method stub
		return sqltemplate.selectList("product.search",search);
	}

	public List<ProductVO> productsearch(Map<String, Object> map) {
		return sqltemplate.selectList("product.searchdetail",map);
	}

	public List<ProductVO> detail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqltemplate.selectList("product.detail",map);
	}
	
	
}