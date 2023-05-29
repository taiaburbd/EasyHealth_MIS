package it.unicas.users.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.users.dao.UserManagementDAO;

public class DeleteUserAction extends ActionSupport{

	private String userName;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = UserManagementDAO.deleteItem(userName);
		if (recordDeleted == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
