package custom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import custom.customer.model.Customer;
import custom.register.service.RegisterService;

@Controller
public class ListController {
	@Autowired
	private RegisterService service;

	@GetMapping("/list")
	public String list(Model model) {
		List<Customer> list = service.list();
		model.addAttribute("list", list);
		return "list";
	}

	@RequestMapping("/detail")
	public String list(Model model, String id) {
		 Customer list= service.searchById(id);
		model.addAttribute("list",list);
		return "detail";
	}
	

}
