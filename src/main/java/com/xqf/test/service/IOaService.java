package com.xqf.test.service;

import com.xqf.test.entity.OaProduct;
import com.xqf.test.util.R;

import java.util.List;

/**
 * @author xuqifeng
 * @create 2022/8/3 17:21
 **/

public interface IOaService {

    /**
     * 测试
     * @param name
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<OaProduct> test(String name, Integer pageNum, Integer pageSize);

    /**
     * 测试
     * @param name
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<OaProduct> useLimit(String name, Integer pageNum, Integer pageSize);
}
