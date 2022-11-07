package com.shopping.web2.model;

import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpSession;

public interface MemberService {

	public boolean create(Map<String, Object> map);
	
	public Map<String, Object> loginCheck(Map<String, Object> map);
	
	public void logout(HttpSession session);
	
	public Map<String, Object> selectDetail(Map<String, Object>map);

	public int update(Map<String, Object> map);
		
	public List<Map<String,Object>> list(Map<String, Object> map);
	
	public int delete(Map<String, Object> map);
	
}
