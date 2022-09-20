package com.xqf.test.feign;

//import com.xqf.test.fallback.ApiFallbackFactory;
import com.xqf.test.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuqifeng
 * @create 2022/9/20 10:14
 **/

//@FeignClient(path = "http://localhost:8085/alarm/alarmCount", name = "apiName", fallbackFactory = ApiFallbackFactory.class)
public interface ApiService {

    /**
     * sss
     * @return
     */
    @GetMapping("/alarmCount")
    R alarmCount();
}
