package com.mypet.web.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	public Customer findByUseridAndPasswd(String userid , String passwd);
}
