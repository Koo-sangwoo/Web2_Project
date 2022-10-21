package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import com.shopping.web2.dao.CartDao;
import com.shopping.web2.dao.ProductDao;
import com.shopping.web2.vo.ProductVO;

public class ProductServiceImpl implements ProductService {

	private ProductDao dao;

	@Override
	public List<ProductVO> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.list(map);
	}


}
