package kr.hs.study.model.dto;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
/*Container에 bean으로 등록되면서 service역할을 한다는 것을 알려주는 어노테이션이다.*/
public class MemberDAOImpl {
	public void insert(MemberDTO dto) {
		
	}
	public List<MemberDTO> select(){
		return null;
		
	}
}
