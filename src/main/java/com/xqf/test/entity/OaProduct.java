package com.xqf.test.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author xuqifeng
 * @create 2022/8/3 17:12
 **/

@Data
public class OaProduct {
    private Long id;
    private String name;
    private String code;
    private Integer point;
    private Double marketPrice;
    private String content;
    private String image;
    private Date createTime;
    private Boolean status;
    private String remark;
    private Integer type;
}
