package com.rookie.bigdata.server.constant;

/**
 * @Class Constant
 * @Description
 * @Author rookie
 * @Date 2024/6/11 11:18
 * @Version 1.0
 */
public interface Constant {

    int ZK_SESSION_TIMEOUT = 5000;

    String ZK_REGISTRY_PATH = "/registrys";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
