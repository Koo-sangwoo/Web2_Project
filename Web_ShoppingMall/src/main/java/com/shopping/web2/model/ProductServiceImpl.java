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


}
