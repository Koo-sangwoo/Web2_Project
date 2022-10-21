package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

public interface ProductService {
	List<Map<String, Object>> list(String productID);
}
