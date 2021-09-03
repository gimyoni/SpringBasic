package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class MapperClass implements RowMapper<BookDTO>{
	
	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDTO dto = new BookDTO();
		dto.setTitle(rs.getString("title"));
		dto.setAuthor(rs.getString("author"));
		dto.setPrice(rs.getInt("price"));
		dto.setPub_date(rs.getString("pub_date"));

		return dto;
	}
}
