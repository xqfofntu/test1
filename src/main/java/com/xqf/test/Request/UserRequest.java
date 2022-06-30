package com.xqf.test.Request;

import com.xqf.test.entity.Thing;

import java.util.List;

/**
 * @author xuqifeng
 * @create 2022/6/30 11:36
 **/
public class UserRequest {
    private Integer id;
    private String username;
    List<Thing> list;

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

    public List<Thing> getList() {
        return list;
    }

    public void setList(List<Thing> list) {
        this.list = list;
    }
}
