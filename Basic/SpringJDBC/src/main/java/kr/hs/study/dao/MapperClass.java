package kr.hs.study.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import kr.hs.study.dto.LoginDTO;

@Component
public class MapperClass implements RowMapper<LoginDTO>{
	@Override
	public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginDTO dto = new LoginDTO();
		dto.setUserid(rs.getString("userid"));
		dto.setUserpass(rs.getInt("userpass"));
		return dto;
	}
}