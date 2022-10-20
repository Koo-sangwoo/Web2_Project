package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

public interface CartService {

	List<Map<String, Object>> list(String memberId);

	void update(Map<String, Object> map);

	void delete(String cartId);

	void updateSize(Map<String, Object> map);

}
