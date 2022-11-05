package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.CartDao;
import com.shopping.web2.vo.CartVO;

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
	public boolean updateSize(Map<String, Object> map) {
		List<Map<String, Object>> duplicateList = dao.duplicateList(map);
		if(duplicateList.isEmpty())
		{dao.updateSize(map);
		return true;}
		else {return false;}
		}


	@Override
	public int countCart(String productId, String memberId,String size) {
		return dao.countCart(productId, memberId, size);
	}

	@Override
	public void insertCart(Map<String, Object> map) {
		dao.addCart(map);
		
	}

	@Override
	public void updateCart(Map<String, Object> map) {
		dao.updateCart(map);
		
	}



}
