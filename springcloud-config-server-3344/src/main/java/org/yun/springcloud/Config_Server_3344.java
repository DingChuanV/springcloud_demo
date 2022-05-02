package org.yun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wanglufei
 * @title: Config_Server_3344
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/86:56 下午
 */
@SpringBootApplication
@EnableConfigServer
public class Config_Server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class, args);
    }
}
