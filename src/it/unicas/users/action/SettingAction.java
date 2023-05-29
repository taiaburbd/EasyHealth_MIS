package it.unicas.users.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.users.dao.UserManagementDAO;
import it.unicas.users.pojo.Users;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SettingAction extends ActionSupport{

    private List<Users> userList;
    private String userName;
    private String password;
    private Date createdDate;

    public void initializeData() {
        System.out.println("****** Filter Data ******");

        String createdDateStr = "";
        if(createdDate != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            createdDateStr = formatter.format(createdDate);
        }
        userList = UserManagementDAO.getAllData(userName, createdDateStr);
    }

    public String execute() {
        initializeData();
        return "success";
    }

    public List<Users> getUserList() {
        return userList;
    }

    public void setUserList(List<Users> userList) {
        this.userList = userList;
    }

    public String getUserName() {
        return userName;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
