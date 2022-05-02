package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wanglufei
 * @title: eurekaServer_7001
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/54:47 下午
 */
@SpringBootApplication
@EnableEurekaServer     //eureka服务端的启动类，可以接受别人注册进来
public class eurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaServer_7003.class,args);
    }
}
