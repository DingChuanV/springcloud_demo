package org.yun.yun;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanglufei
 * @title: YunRule
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/610:48 上午
 */
@Configuration
public class YunRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
