package com.shopping.web2.model;

import java.util.List;
import java.util.Map;

import com.shopping.web2.vo.BoardVO;


public interface BoardService {

	List<BoardVO> list(Map<String, Object> map);

	List<Map<String, Object>> regist_review(Map<String, Object> map);
	
	public void post_review(BoardVO vo);
	
}
