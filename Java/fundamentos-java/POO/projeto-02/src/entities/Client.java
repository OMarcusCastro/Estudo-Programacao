package entities;

import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDate;


	public Client() {
	}

	public Client(String name,String email,Date date) {
		this.email = email;
		this.name = name;
		this.birthDate = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getbirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
