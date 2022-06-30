package com.xqf.test.entity;

import java.io.Serializable;

/**
 * @author xuqifeng
 * @create 2022/6/30 11:29
 **/
public class Thing implements Serializable {
    private static final long serialVersionUID = 1324674544513944072L;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
