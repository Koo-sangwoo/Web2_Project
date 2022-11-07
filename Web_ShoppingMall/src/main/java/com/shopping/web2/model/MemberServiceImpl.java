package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.MemberDao;

import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao dao;
	
	@Override
	public boolean create(Map<String, Object> map) {
			int result = dao.create(map);	
			return result == 1;
	}
	
	@Override
	public Map<String, Object> loginCheck(Map<String, Object> map) {
		Map<String, Object> name = dao.loginCheck(map);
		return name;
	}

	@Override
	public void logout(HttpSession session) {
	 session.invalidate();
	 }
	
	@Override
	public Map<String, Object> selectDetail(Map<String, Object> map) {
		return dao.selectDetail(map);
	}

	@Override
	public int update(Map<String, Object> map) {
		return dao.update(map);
	}

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		return dao.list(map);
	}

	@Override
	public int delete(Map<String, Object> map) {
		return dao.delete(map);
	}
}
