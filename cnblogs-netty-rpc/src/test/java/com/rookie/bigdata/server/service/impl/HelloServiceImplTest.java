package com.rookie.bigdata.server.service.impl;

import com.rookie.bigdata.common.RpcProxy;
import com.rookie.bigdata.server.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Class HelloServiceImplTest
 * @Description
 * @Author rookie
 * @Date 2024/6/11 11:30
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class HelloServiceImplTest {

    @Autowired
    private RpcProxy rpcProxy;

    @Test
    public void helloTest() {
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        Assert.assertEquals("Hello! World", result);
    }
}
