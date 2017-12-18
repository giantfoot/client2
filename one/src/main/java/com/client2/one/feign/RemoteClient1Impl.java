package com.client2.one.feign;

import org.springframework.stereotype.Component;

/**
 * @author yy.zhang yangyang.zhang@anxincloud.com
 * @Description
 * @date 2017/12/13 13:41
 */
@Component
public class RemoteClient1Impl implements RemoteClient1 {
    @Override
    public String sayHiFromClient1(String name) {
        return "sorry," + name;
    }
}
