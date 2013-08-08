package cs.mum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "user", schema = "coasdb")
public class User {
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailAddress;
	private String confirmEmail;
	private boolean status;
	private Date creationDate;
	private UserLogin login;
	private String regVerification;
	
	public User() {
		
	}

	public User(String firstName, String middleName, String lastName,
			String emailAddress, boolean status, Date creationDate, String regVerification) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.status = status;
		this.creationDate = creationDate;
		this.regVerification = regVerification;
	}

	@Id
	@GeneratedValue
	@Column (name ="id")
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@OneToOne(mappedBy="user")
	public UserLogin getLogin() {
		return login;
	}

	public void setLogin(UserLogin login) {
		this.login = login;
	}

	public String getRegVerification() {
		return regVerification;
	}

	public void setRegVerification(String regVerification) {
		this.regVerification = regVerification;
	}
	@Transient
	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
}
