package org.yun.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

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
@EnableDiscoveryClient //开启服务发现
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class, args);
    }

    //增加一个servlet
    @Bean
    public ServletRegistrationBean bean() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
