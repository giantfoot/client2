package com.client2.one.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yy.zhang yangyang.zhang@anxincloud.com
 * @Description
 * @date 2017/12/13 11:36
 */
@Component
@FeignClient(value = "client1", fallback = RemoteClient1Impl.class)
public interface RemoteClient1 {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient1(@RequestParam(value = "name") String name);

}
