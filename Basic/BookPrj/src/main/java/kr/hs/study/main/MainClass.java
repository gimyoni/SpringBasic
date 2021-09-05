package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(JavaConfig.class);		//java  설정
		
		//LoginDAO 가져오기
		//LoginDTO 가져와서  값을 입력한다 (kim,1111) 
		//insert_data 호출해봐
		BookDAO dao=ctx.getBean(BookDAO.class);
		BookDTO dto1=ctx.getBean(BookDTO.class);
		dto1.setTitle("chicken");
		dto1.setAuthor("kim");
		dto1.setPrice(10000);
		dto1.setPub_date("2020-09-08");
		dao.insert_data(dto1);
		
		List<BookDTO> list = dao.select_data();
		for(BookDTO dto4:list) {
			System.out.println(dto4.getTitle());
			System.out.println(dto4.getAuthor());
			System.out.println(dto4.getPrice());
			System.out.println(dto4.getPub_date());

		}
		ctx.close();
		
	}
}
