package com.mypet.web.person;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name= "PERSON")
@Component
@NoArgsConstructor(access= AccessLevel.PUBLIC)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ID", nullable=false) private Long id;
	@Column(name= "USERID",length = 64, nullable=false) private String userid;
	@Column(name= "PASSWD",length = 64, nullable=false) private String passwd;
	@Column(name= "NAME",length = 64, nullable=false) private String name;
	@Temporal(TemporalType.DATE)
	@Column(name= "BIRTHDAY", nullable=false) private Date birthday;
}
