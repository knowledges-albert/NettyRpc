package com.rookie.bigdata.server.service.impl;

import com.rookie.bigdata.server.anno.RpcService;
import com.rookie.bigdata.server.service.HelloService;

/**
 * @Class HelloServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/11 11:13
 * @Version 1.0
 */
// 指定远程接口//使用RpcService注解定义在服务接口的实现类上，需要对该实现类指定远程接口，因为实现类可能会实现多个接口，一定要告诉框架哪个才是远程接口。
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}
