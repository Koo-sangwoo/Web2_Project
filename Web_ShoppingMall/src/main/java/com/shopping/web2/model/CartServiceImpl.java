package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.CartDao;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao dao;
	
	@Override
	public List<Map<String, Object>> list(String memberId) {
		// TODO Auto-generated method stub
		return dao.list(memberId);
	}
	
	@Override
	public void update(Map<String, Object> map) {
		dao.update(map);
		
	}

	@Override
	public void delete(String cartId) {
		dao.delete(cartId);
		
	}

	@Override
	public void updateSize(Map<String, Object> map) {
		dao.updateSize(map);
		
	}

}
