package com.mypet.web.customer;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class CustomerInit implements ApplicationRunner{
	private CustomerRepository customerRepository;
	public CustomerInit(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = customerRepository.count();
		if(count == 0) {
			Customer customer = null;
			String [][] customers = {
					   {"park","1","박근호","true","170","80","20","40"},
					   {"hong","1","홍길동","true","171","81","21","41"},
					   {"you","1","유관순","true","172","82","22","23"},
					   {"kim","1","김유신","true","173","83","24","44"},
					   {"bak","1","백두산","false","174","60","25","22"},
					   {"you1","1","유재석","true","175","87","26","20"}};
			for(String [] arr : customers) {
				customer = new Customer();
				customer.setUserid(arr[0]);
				customer.setPasswd(arr[1]);
				customer.setName(arr[2]);
				customer.setGender(Boolean.parseBoolean(arr[3]));
				customer.setHeight(arr[4]);
				customer.setWeight(arr[5]);
				customer.setFat(arr[6]);
				customer.setMuscle(arr[7]);
				customerRepository.save(customer);
			}
		}
	}
}
