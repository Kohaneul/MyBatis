package custom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	//메인페이지의 view 를 반환하는 Controller
	@GetMapping("/main")
	public String mainPage() {
		return "main";
	}
}
