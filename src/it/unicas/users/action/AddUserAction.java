package it.unicas.users.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.users.dao.UserManagementDAO;
import it.unicas.users.pojo.Users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddUserAction extends ActionSupport {

    private String userName;
    private String userPassword;
    private String createdDate;

    public String execute() {
        String statusCode = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String createdDateStr = formatter.format(new Date());

        Users user = new Users(userName,userPassword, createdDateStr);
        int recordAdded = UserManagementDAO.addItem(user);

        System.out.println(recordAdded);

        if (recordAdded == 1) {
            statusCode = ActionSupport.SUCCESS;
        } else {
            statusCode = ActionSupport.ERROR;
        }
        return statusCode;
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
}
