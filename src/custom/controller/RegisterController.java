package custom.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import custom.register.model.Register;
import custom.register.service.RegisterService;

@Controller
public class RegisterController {
	//회원가입 페이지에 대한 view를 반환하는 controller
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	
	
	@PostMapping("/register")
	public String setRegister(HttpSession session, Model model, Register register,HttpServletRequest request) {
		//에러메세지가 존재하면 다시 가입페이지로 이동
		registerService.check(register);
		if(register.getError()!=null) {
			System.out.println("회원가입실패 [ 이유 : "+register.getError()+"] ");
			System.out.println("회원가입 페이지로 다시 이동합니다.");
			return "register";
		}
		else {
			
			session.setAttribute("register", register);
			return "registerSuccess";
		}
	}
	
	
}
