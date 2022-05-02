package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wanglufei
 * @title: ZuulApplication_9527
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/83:59 下午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9527.class, args);
    }
}
