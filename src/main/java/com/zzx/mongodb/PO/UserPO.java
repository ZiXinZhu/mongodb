package com.zzx.mongodb.PO;

import java.util.List;


public class UserPO {
    private String UserID;
    private String username;
    private String password;
    private String time;
    private List<RolePO> roles;

    @Override
    public String toString() {
        return "UserPO{" +
                "UserID='" + UserID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", time='" + time + '\'' +
                ", roles=" + roles +
                '}';
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RolePO> getRoles() {
        return roles;
    }

    public void setRoles(List<RolePO> roles) {
        this.roles = roles;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
