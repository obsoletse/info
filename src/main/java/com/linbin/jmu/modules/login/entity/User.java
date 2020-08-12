package com.linbin.jmu.modules.login.entity;


/**
 * @Author: LinBin
 * @Date: 2020/8/6 22:57
 * @Version: V1.0
 * @Description:
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Boolean checked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
