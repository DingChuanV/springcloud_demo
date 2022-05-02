package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

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
//添加对熔断的支持
@EnableCircuitBreaker //断路器
public class DeptProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001_Hystrix.class, args);
    }
}
