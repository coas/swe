package cs.mum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class UserLogin {
	private long id;
	private String userName;
	private String password;
	private String confirmPassword;
	private String newPassword;
	private User user;
	private String userType;
	
	

	public UserLogin() {
		
	}

	public UserLogin(String userName, String password,
			String confirmPassword,String userType, User user) {
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.userType=userType;
		this.user = user;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}
	public String getUserType() {
		return userType;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Transient
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Transient
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@OneToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
