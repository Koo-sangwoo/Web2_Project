package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import com.shopping.web2.vo.ProductVO;

public interface ProductService {

	List<ProductVO> productListAll();

	List<ProductVO> productSearch(String search);

	List<ProductVO> productSearchDetail(Map<String, Object> map);

	List<ProductVO> productDetail(Map<String, Object> map);


	List<ProductVO> productLists(Map<String, Object> map);
}
