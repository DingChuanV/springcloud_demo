package org.yun.springcloud.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yun.springcloud.pojo.Dept;
import org.yun.springcloud.service.DeptClientService;

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
     * feign是声名式的web service客户端，他让微服务之间的调用变得更简单，类似controller调用service。springcloud
     * 继承了Ribbon和Eureka，可在使用Feign时提供负载均衡的http客户端。
     * 只需要创建一个接口，然后添加注解即可。
     * feign，主要是社区，大家都习惯面向接口编程。这个是很多开发人员的规范。调用微服务两种方法
     * 1. 微服务的名字（ribbon）
     * 2. 接口和注解（feign）
     * feign能干什么？
     *      feign旨在使用Ribbon+RestTemplate对Http请求的封装处理，形成了一种模套化的调用方法。但是实际开发中，由于对服务
     *      依赖的调用可能不止一处，往往一个接口会被多处调用，所以通常都会针对每个微服务自行封装一些客户端类来包装这些依赖服务的调用。
     *      所以，feign再次基础上创建一个接口并使用注解的方式来配置它（类似于以前的Dao接口标注Mapper注解，现在是一个微服务接口上
     *      标注一个Feign注解即可。）即可完成对服务方的接口绑定，简化了使用Spring Cloud Ribbon时，自动封装服务调用客户端的开发量。
     * feign继承了Ribbon
     */
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private DeptClientService deptClientService = null;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //Ribbon 我们这里的地址不应该写死，应该是一个变量，应该通过服务名来访问
    //private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAll() {
        return this.deptClientService.queryAll();
    }

}
