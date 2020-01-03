package com.mypet.web.customer;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypet.web.proxy.Box;
import com.mypet.web.proxy.Trunk;
import com.mypet.web.util.Printer;

@RestController
@RequestMapping("/")
@CrossOrigin
public class CustomerController {
	@Autowired Printer printer;
	@Autowired Trunk<Object> trunk;
	@Autowired Box<Object> box;
	@Autowired private CustomerRepository customerRepository;
	@Autowired private Customer customer;
	
	@PostMapping("/login")
	public HashMap<String, Object> login(@RequestBody Customer param){
		printer.accept("로그인 진입");
		customer = customerRepository.findByUseridAndPasswd(param.getUserid(), param.getPasswd());
		trunk.put("msg","success");
		trunk.put("customer",customer);
		return trunk.get();
	}
}
