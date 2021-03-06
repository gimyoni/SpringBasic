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

import kr.hs.study.model.dto.LoginDTO;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	// IOC container에서 SqlSessionTemplate
	
	@GetMapping("/login")
	public String login(LoginDTO dto) {
		return "login";
	}
	
	@PostMapping("/result")
	public String login_re(@ModelAttribute("login") LoginDTO dto) {
		sqlsessiontemplate.insert("login.insert", dto); // namespace.insertoneid, 추가할 bean
		return "result";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping("/delete_result")
	public String delete2(@RequestParam("ID") String ID) {
		System.out.println("id: "+ ID);
		sqlsessiontemplate.delete("login.delete", ID);
		return "delete_result";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<LoginDTO> temp = sqlsessiontemplate.selectList("login.list1");
		model.addAttribute("temp",temp);
		return "result3";
		
	}

}