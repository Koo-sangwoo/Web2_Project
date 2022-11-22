package com.shopping.web2.model;

import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpSession;

import com.shopping.web2.vo.MemberVO;

public interface MemberService {

	
	public void logout(HttpSession session);
	
	public Map<String, Object> selectDetail(Map<String, Object>map);

	public int update(Map<String, Object> map);
		
	public List<Map<String,Object>> list(Map<String, Object> map);
	
	public int delete(Map<String, Object> map);

	public boolean create(MemberVO vo);

	public Map<String, Object> loginCheck(MemberVO vo);
	
}
