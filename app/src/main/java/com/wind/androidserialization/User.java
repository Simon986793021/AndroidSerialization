package com.wind.androidserialization;

import java.io.Serializable;

/**
 * Created by zhangcong on 2017/11/15.
 * @author zhangcong
 */

public class User   implements Serializable{
    private static final long serialVersionUID = 8066301618436107542L;

    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
