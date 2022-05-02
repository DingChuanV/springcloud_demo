package org.yun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglufei
 * @title: ConfigClientController
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/88:21 下午
 */
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        return "application:" + applicationName +
                "eurekaServer:" + eurekaServer +
                "port:" + port;
    }
}
