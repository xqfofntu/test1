package com.xqf.test.fallback;

import com.xqf.test.feign.ApiService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author xuqifeng
 * @create 2022/9/20 10:24
 **/

//@Component
//public class ApiFallbackFactory implements FallbackFactory<ApiService> {
//    @Override
//    public ApiService create(Throwable throwable) {
//        System.out.println("error");
//        return null;
//    }
//}
