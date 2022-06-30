package com.xqf.test.entity;

import java.io.Serializable;

/**
 * @author xuqifeng
 * @create 2022/6/30 11:26
 **/
public class User implements Serializable {
    private static final long serialVersionUID = -5023667638003356373L;

    private Integer id;
    private String username;

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
}
