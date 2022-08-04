package com.xqf.test.mapper;

import com.xqf.test.entity.OaProduct;
import com.xqf.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xuqifeng
 * @create 2022/6/30 11:32
 **/
@Mapper
public interface UserMapper {
    /**
     * jjj
     * @return
     */
    User getUser();

    /**
     * ff
     * @param name
     * @return
     */
    List<OaProduct> test(String name);

    /**
     * ff
     * @param map
     * @return
     */
    List<OaProduct> useLimit(Map<String,Object> map);
}
