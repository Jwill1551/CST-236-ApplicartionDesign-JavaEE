package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class User {
	private String firstName;
	private String lastName;
	
	//First name getter and setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Last name getter and setter
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public User(){
		firstName = "Joshua";
		lastName = "Williams";
	}
	
	public User(String f, String l){
		this.firstName = f;
		this.lastName = l;
	}

}
