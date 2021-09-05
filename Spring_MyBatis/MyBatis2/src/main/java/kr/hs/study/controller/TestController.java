package kr.hs.study.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.DTO.ModelDTO;


@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	// IOC container¿¡¼­ SqlSessionTemplat
	
	@GetMapping("/login_form")
	public String login(ModelDTO dto) {
		return "login_form";
	}
	
	@PostMapping("/result")
	public String login_re(@ModelAttribute("login") ModelDTO dto) {
		sqlsessiontemplate.insert("login.insert", dto);
		return "result";
	}
	
}