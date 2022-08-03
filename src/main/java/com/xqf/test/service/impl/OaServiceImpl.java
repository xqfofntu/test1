package com.xqf.test.service.impl;

import com.xqf.test.entity.OaProduct;
import com.xqf.test.mapper.UserMapper;
import com.xqf.test.service.IOaService;
import com.xqf.test.util.PageUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuqifeng
 * @create 2022/8/3 17:28
 **/

@Service
public class OaServiceImpl implements IOaService{

    private final UserMapper userMapper;

    public OaServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<OaProduct> test(String name, Integer pageNum, Integer pageSize) {
        PageUtils.startPage(pageNum,pageSize);
        return userMapper.test(name);
    }
}
