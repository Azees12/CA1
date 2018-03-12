package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity


@DiscriminatorValue("employee")




public class Employees extends User {

	private String age;
	
	public Employees() {

	}
	public Employees(String email,String name,String role, String age , String password)
	{
		super(email, role, name, password);

	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}



}