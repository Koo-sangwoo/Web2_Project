package com.shopping.web2.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.web2.vo.BoardVO;


@Repository
public class BoardDao {
	@Autowired
	private SqlSessionTemplate sqltemplate;

	public List<BoardVO> list(Map<String, Object> map) {
		int start = (int)(map.get("num")) *(int)(map.get("pernum"))-(int)(map.get("pernum"));		
		map.put("start", start);
		return sqltemplate.selectList("board.list", map);
	}

}
