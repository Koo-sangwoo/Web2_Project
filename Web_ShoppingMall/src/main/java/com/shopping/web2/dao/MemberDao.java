package com.shopping.web2.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.shopping.web2.vo.MemberVO;

@Repository
public class MemberDao {

	@Autowired
	private SqlSessionTemplate sqltemplate;
	
	public List<MemberVO> list(String search){
		return sqltemplate.selectList("member.list",search);
	}
}
