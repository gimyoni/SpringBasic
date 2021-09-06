package kr.hs.study.service;

import java.util.List;

import kr.hs.study.model.dto.MemberDTO;

public interface MemberService {
	public void insert(MemberDTO dto);
	public List<MemberDTO> select();
}
