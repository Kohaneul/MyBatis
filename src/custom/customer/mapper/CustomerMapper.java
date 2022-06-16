package custom.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import custom.customer.model.Customer;
import custom.register.model.Register;

@Mapper
public interface CustomerMapper {
	public int insert(Register register);
	
	public Customer selectById(String id);
	
	@Select("select * from CUS ORDER BY id DESC")
	public List<Customer> selectAll();
}
