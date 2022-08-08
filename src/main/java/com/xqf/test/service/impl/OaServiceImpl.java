package com.xqf.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.xqf.test.entity.OaProduct;
import com.xqf.test.mapper.UserMapper;
import com.xqf.test.service.IOaService;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuqifeng
 * @create 2022/8/3 17:28
 **/

@Service
public class OaServiceImpl implements IOaService{

    private final UserMapper userMapper;
    private final RedisTemplate redisTemplate;

    public OaServiceImpl(UserMapper userMapper, RedisTemplate redisTemplate) {
        this.userMapper = userMapper;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public List<OaProduct> test(String name, Integer pageNum, Integer pageSize) {
//        PageUtils.startPage(pageNum,pageSize);
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.test(name);
    }

    @Override
    public List<OaProduct> useLimit(String name, Integer pageNum, Integer pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("pageNum",(pageNum - 1) * pageSize);
        map.put("pageSize", pageSize);
        return userMapper.useLimit(map);
    }

    @Override
    public Map<String, String> redisTest(String name) {
        List<OaProduct> test = userMapper.test(name);
        test.forEach(item -> {
            redisTemplate.opsForValue().set(item.getName(),item.getContent());
        });
        Map<String, String> map = new HashMap<>();
        test.forEach(item -> {
            map.put(item.getName(), item.getContent());
            System.out.println(redisTemplate.opsForValue().get(item.getName()));
        });
        return map;
    }


}
