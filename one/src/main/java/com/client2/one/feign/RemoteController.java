package com.client2.one.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy.zhang yangyang.zhang@anxincloud.com
 * @Description
 * @date 2017/12/13 11:42
 */
@RestController
public class RemoteController {

    @Autowired
    RemoteClient1 remoteClient1;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return remoteClient1.sayHiFromClient1(name);
    }
}
