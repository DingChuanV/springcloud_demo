package org.yun.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yun.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author wanglufei
 * @title: DeptConsumerController
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/5/11:20 上午
 */
@RestController
public class DeptConsumerController {
    /**
     * 理解：消费者，不应该有service层
     * 解决： RestTemplate ... 可以供我们调用
     * 解决什么问题： 提供多种便捷访问远程http服务的方法
     * 三个核心参数：
     * String url, Class<T> responseType, Map<String，？>
     * 用Map来封装实体
     */
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //Ribbon 我们这里的地址不应该写死，应该是一个变量，应该通过服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
