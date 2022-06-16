package custom.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.customer.model.Customer;
import custom.login.model.Login;
import custom.register.service.RegisterService;

@Service
public class LoginService {
	@Autowired
	private RegisterService registerService;
	
	public void loginCheck(Login login) {
		Customer customer = registerService.searchById(login.getId());
		
		if(customer==null) {
			System.out.println("아이디가 존재하지 않습니다.");
			login.setError("아이디가 존재하지 않습니다.");
		}
		else {
			if(!customer.getPassword().equals(login.getPassword())) {
				login.setError("비밀번호를 다시 확인해주세요.");
			}
			else {
				login.setError(null);
			}
		}
		
		
	}
	
	
	
}
