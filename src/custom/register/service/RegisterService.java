package custom.register.service;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
=======
>>>>>>> branch 'main' of https://github.com/Kohaneul/MyBatis.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.customer.mapper.CustomerMapper;
import custom.customer.model.Customer;
import custom.register.model.Register;

@Service
public class RegisterService {
	@Autowired
	private CustomerMapper mapper;
	
	
	
	public void check(Register register) {
		Customer customer = mapper.selectById(register.getId());
		if(customer==null) {
			//아이디(=customer객체) 존재하지않음=>회원가입 가능
			System.out.println("회원가입 가능");
			//id, name, password, phone;
			mapper.insert(register);
			register.setError(null);
		}
		else {
			register.setError("ID가 존재합니다.");
		}
	}
	
	public List<Customer> list(){
		return new ArrayList<Customer>(mapper.selectAll());
	}
	
	public Customer searchById(String id) {
		return mapper.selectById(id);
	}
	
	
	
}
