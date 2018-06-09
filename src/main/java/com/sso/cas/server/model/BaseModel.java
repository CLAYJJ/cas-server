package com.sso.cas.server.model;

import java.io.Serializable;
import java.util.Date;

/*
 *
 * 基础类
 * @Author luo jiajia
 * @Date 2018/6/9 0009 上午 11:26
 */
public abstract class BaseModel implements Serializable {

   protected String id;
   protected Date createDate;
   protected String createUser;
   protected Date modifyDate;
   protected String modifyUser;
   protected String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
