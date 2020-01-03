package com.mypet.web.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import com.mypet.web.proxy.Proxy;
import com.mypet.web.routine.Routine;
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
@Table(name="CUSTOMER",uniqueConstraints={
	@UniqueConstraint(
		columnNames={"USERID"}
	)
})
public class Customer extends Proxy implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "CUSTOMERID")@NotNull private Long customerid;
	@Column(name= "userid")@NotNull private String userid;
	@Column(name= "passwd")@NotNull private String passwd;
	@Column(name= "name")@NotNull private String name;
	@Column(name= "gender")@NotNull private boolean gender;
	@Column(name= "height")@NotNull private String height;
	@Column(name= "weight")@NotNull private String weight;
	@Column(name= "fat")@NotNull private String fat;
	@Column(name= "muscle")@NotNull private String muscle;
	
	@OneToMany(mappedBy = "customerid",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Routine> articles = new ArrayList<>();
	@Builder
	private Customer(String userid, String passwd, String name, boolean gender,
			String height, String weight, String fat, String muscle) {
		Assert.hasText(userid, "bankName must not be empty");
	    Assert.hasText(passwd, "accountNumber must not be empty");
	    Assert.hasText(name, "accountHolder must not be empty");
	    Assert.hasText(height, "accountHolder must not be empty");
	    Assert.hasText(weight, "accountHolder must not be empty");
	    Assert.hasText(fat, "accountHolder must not be empty");
	    Assert.hasText(muscle, "accountHolder must not be empty");
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.fat = fat;
		this.muscle = muscle;
		
	}


	
}
