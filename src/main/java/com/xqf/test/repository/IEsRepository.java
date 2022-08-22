package com.xqf.test.repository;

import com.xqf.test.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author xuqifeng
 * @create 2022/8/9 14:45
 **/

public interface IEsRepository extends ElasticsearchRepository<User, String> {

}
