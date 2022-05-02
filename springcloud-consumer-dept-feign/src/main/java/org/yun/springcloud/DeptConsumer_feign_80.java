package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wanglufei
 * @title: DeptConsumer_80
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/511:52 上午
 */
//Ribbon 和Eureka整合以后，客户端可以直接调用访问，不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.yun.springcloud"})
public class DeptConsumer_feign_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign_80.class, args);
    }

}
