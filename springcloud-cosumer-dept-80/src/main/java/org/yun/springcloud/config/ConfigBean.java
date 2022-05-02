package org.yun.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanglufei
 * @title: ConfigBean
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/5/11:26 上午
 */
@Configuration  //相当于---spring 中的applicationContext.xml
public class ConfigBean {
    /**
     * 提供多种便捷访问远程http服务的方 法
     *
     * @return
     */
    @Bean
    @LoadBalanced  //配置负载均衡实现restTemplate -->Ribbon
    /**
     * IRule
     * AvailabilityFilteringRule:会先过滤掉，跳闸的服务，访问故障的服务～，对剩下的进行轮询～
     * RoundRobinRule 轮训
     * RetryRule 会先按照轮训获取服务，如果服务获取失败，则会在指定的时间内重试
     */
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
