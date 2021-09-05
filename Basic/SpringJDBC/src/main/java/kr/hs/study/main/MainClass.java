package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(JavaConfig.class);		//java  설정
		
		//LoginDAO 가져오기
		//LoginDTO 가져와서  값을 입력한다 (kim,1111) 
		//insert_data 호출해봐
		LoginDAO dao=ctx.getBean(LoginDAO.class);
		LoginDTO dto1=ctx.getBean(LoginDTO.class);
		dto1.setUserid("kim");
		dto1.setUserpass(1111);
		dao.insert_data(dto1);
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto4:list) {
			System.out.println(dto4.getUserid());
			System.out.println(dto4.getUserpass());
		}
		ctx.close();
		
	}
}
