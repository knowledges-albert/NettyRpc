package com.rookie.bigdata.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Class RpcBootstrap
 * @Description https://www.cnblogs.com/mxz1994/p/8435917.html
 * @Author rookie
 * @Date 2024/6/11 11:16
 * @Version 1.0
 */
public class RpcBootstrap {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("server-spring.xml");
    }
}
