package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.web2.dao.BoardDao;
import com.shopping.web2.vo.BoardVO;


@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao dao;
	
	@Override
	public List<BoardVO> list(Map<String, Object> map) {		
		return dao.list(map);
	}

}
