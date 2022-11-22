package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.MemberDao;
import com.shopping.web2.vo.MemberVO;

import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao dao;
	

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

	@Override
	public boolean create(MemberVO vo) {
		int result = dao.create(vo);	
		return result == 1;
	}

	@Override
	public Map<String, Object> loginCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		Map<String, Object> name = dao.loginCheck(vo);
		return name;
	}
}
