package it.unicas.users.pojo;

public class Users {
	private String userName;
	private String userPassword;
	private String createdDate;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String userName, String userPassword, String createdDate) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.createdDate = createdDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Users{" +
				"userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", createdDate='" + createdDate + '\'' +
				'}';
	}
}
