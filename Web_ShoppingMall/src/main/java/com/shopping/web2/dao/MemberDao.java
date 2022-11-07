package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.servlet.http.HttpSession;

@Repository
public class MemberDao {

	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	public int create(Map<String, Object> map) {
		return sqltemplate.insert("member.create", map);
	}
	
	 public Map<String, Object> loginCheck(Map<String, Object> map) {
		 return sqltemplate.selectOne("member.login", map);
	} 
	 
	 public Map<String, Object> logout(HttpSession session) {
		 return sqltemplate.selectOne("member.logout", session);
	} 
	 
	 public Map<String,Object> selectDetail(Map<String, Object> map){
		return sqltemplate.selectOne("member.selectDetail",map);
	}
		
	public int update(Map<String, Object> map) {
		return sqltemplate.update("member.update",map);
	}
		
	public List<Map<String,Object>> list(Map<String, Object> map) {
		return sqltemplate.selectList("member.list",map);		
	}
		
	public int delete(Map<String, Object> map) {
		return sqltemplate.delete("member.delete",map);
	}
}
