package custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import custom.login.model.Login;
import custom.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String start() {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String login(Model model, Login login) {
		loginService.loginCheck(login);
		if(login.getError()==null) {
			System.out.println("다음 페이지로 이동합니다.");
			model.addAttribute("login",login);
			return "loginSuccess";
		}
		else {
			System.out.println(login.getError());
			return "login";
		}
	}
	
	
	
}
