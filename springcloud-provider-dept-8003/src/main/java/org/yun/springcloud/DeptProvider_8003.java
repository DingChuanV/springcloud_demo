package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wanglufei
 * @title: DeptProvider_8001
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/510:37 上午
 */
//启动类

@SpringBootApplication
@EnableEurekaClient  //自动在服务启动之后注册到eureka中
@EnableDiscoveryClient
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class, args);
    }
}
