package custom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
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
	
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	
	@RequestMapping(value="/detail/{id}", method=RequestMethod.GET)
	public ModelAndView boardListGet(ModelAndView mv) {
		mv.setViewName("/detail");
		return mv;
	}
>>>>>>> branch 'main' of https://github.com/Kohaneul/MyBatis.git

}
