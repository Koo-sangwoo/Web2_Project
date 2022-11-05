package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import com.shopping.web2.vo.CartVO;

public interface CartService {

	List<Map<String, Object>> list(String memberId);

	void update(Map<String, Object> map);

	void delete(String cartId);

	boolean updateSize(Map<String, Object> map);
	
	void insertCart(Map<String, Object> map);

	int countCart(String productId, String memberId, String size);
	
	void updateCart(Map<String, Object> map);


}

