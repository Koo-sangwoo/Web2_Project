package com.shopping.web2.model;

import java.util.List;
import com.shopping.web2.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> list(String search);
}
