package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.CartDao;
import com.shopping.web2.dao.ProductDao;
import com.shopping.web2.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public List<ProductVO> productLists(String category) {
		return dao.list(category);
	}


	@Override
	public List<ProductVO> productListAll() {
		return dao.list();
	}

	@Override
	public List<ProductVO> productSearch(String search) {
		// TODO Auto-generated method stub
		return dao.searchlists(search);
	}

	@Override
	public List<ProductVO> productSearchDetail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.productsearch(map);
	}


	@Override
	public List<ProductVO> productDetail(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.detail(map);
	}



}