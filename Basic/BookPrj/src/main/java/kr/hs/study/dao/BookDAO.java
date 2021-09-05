package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	MapperClass mapper;
	
	//저장
	public void insert_data(BookDTO dto) {
		String sql="insert into book values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getTitle(),dto.getAuthor(), dto.getPrice(), dto.getPub_date());
		System.out.println("저장완료");
	}
	// 수정
	public void update_data(BookDTO dto) {
		String sql = "update book set author=?,price=?,pub_date=? where title=?";
		jdbcTemplate.update(sql, dto.getTitle(),dto.getAuthor(), dto.getPrice(), dto.getPub_date());
		System.out.println("수정완료");
	}
	// 가져오기
	public List<BookDTO> select_data(){
		String sql ="select * from book";
		List<BookDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
