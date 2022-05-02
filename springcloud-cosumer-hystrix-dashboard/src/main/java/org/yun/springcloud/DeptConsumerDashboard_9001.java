package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wanglufei
 * @title: DeptCosumerDashboard
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/78:10 下午
 */
@SpringBootApplication
//开启监控
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class, args);
    }
}
