package com.mypet.web.routine;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import com.mypet.web.customer.Customer;
import com.mypet.web.proxy.Proxy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name ="ROUTINE")
public class Routine extends Proxy implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROUTINEID") @NotNull private Long routineId;
	@Column(name="DIVISION") @NotNull private int division;
	@Column(name="USERID") @NotNull private String userid;
	@Column(name="DAY") @NotNull private String day;
	@Column(name="EXTIME") @NotNull private String extime;
	@Column(name="REPS") @NotNull private String reps;
	@Column(name="WEIGHT") @NotNull private int weight;
	@Column(name="SETCNT") @NotNull private int setCnt;
	@Column(name="EXPART") @NotNull private String expart;
	@Column(name="EXLEVEL") @NotNull private String exlevel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid")
	private Customer customerid;
	
	@Builder
	private Routine( int division,  String userid,  String day,  String extime,
			 String reps,  int weight,  int setCnt,  String expart,
			 String exlevel, Customer customerid) {
		this.division = division;
		this.userid = userid;
		this.day = day;
		this.extime = extime;
		this.reps = reps;
		this.weight = weight;
		this.setCnt = setCnt;
		this.expart = expart;
		this.exlevel = exlevel;
		this.customerid = customerid;
	}
}
