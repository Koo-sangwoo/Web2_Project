package com.shopping.web2.model;

import java.util.List;

import com.shopping.web2.vo.ProductVO;

public interface ProductService {
	List<ProductVO> productLists(String category);

	List<ProductVO> productDetail(String productId);

	List<ProductVO> productListAll();
}
