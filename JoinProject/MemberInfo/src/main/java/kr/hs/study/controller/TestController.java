package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.MemberDTO;
import kr.hs.study.service.MemberService;

@Controller
public class TestController {
	
	@Autowired
	MemberService memberservice;
	// IOC container¿¡¼­ SqlSessionTemplate
	
	@GetMapping("/login")
	public String login(MemberDTO dto) {
		return "login";
	}
	
	@PostMapping("/result")
	public String login_re(@ModelAttribute("login") MemberDTO dto) {
		memberservice.insert(dto);
		return "result";
	}
}