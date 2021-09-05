package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	MapperClass mapper;
	//저장
	public void insert_data(LoginDTO dto) {
		String sql="insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserid(),dto.getUserpass());
		System.out.println("저장완료");
	}
	// 수정
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
		jdbcTemplate.update(sql, dto.getUserpass(), dto.getUserid());
		System.out.println("수정완료");
	}
	// 가져오기
	public List<LoginDTO> select_data(){
		String sql ="select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
