package com.sso.cas.server.model;
/*
 *
 * 用户表
 * @Author luo jiajia
 * @Date 2018/6/9 0009 上午 11:30
 */
public class CasUser extends BaseModel{

    private String userName;
    private String userPassword;

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

    @Override
    public String toString() {
        return "CasUser{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", id='" + id + '\'' +
                ", createDate=" + createDate +
                ", createUser='" + createUser + '\'' +
                ", modifyDate=" + modifyDate +
                ", modifyUser='" + modifyUser + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
