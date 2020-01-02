package com.mypet.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component 
public class PersonInit implements ApplicationRunner{
	
	private PersonRepository personRepository;
	
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	//databaseconfig 생성자 
	@Autowired
	public PersonInit(PersonRepository personRepository) {
		this.personRepository =  personRepository;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = personRepository.count();
		if(count == 0) {
			Person person = null;
		String[][] mtx = {{"park","1234","Ddong","1999-11-11"},
						   {"hong","1111","홍길동","1993-12-11"},
						   {"you","11211","유관순","1944-13-11"},
						   {"kim","1112","김유신","1959-32-11"}};
		for(String[] arr : mtx){
				person = new Person();
				person.setUserid(arr[0]);
				person.setPasswd(arr[1]);
				person.setName(arr[2]);
				person.setBirthday(df.parse(arr[3]));
				personRepository.save(person);
		  }
	   }
    }
 }

// for(int i=0; i< mtx.length; i++){
// 		person = new Person();
//		person.setUserid(mtx[i][0]);
//		person.setPasswd(mtx[1][1]);
//		person.setName(mtx[i][2]);
//		person.setBirthday(df.parse(mtx[i][3]));
//		personRepository.save(person);
// }
 
