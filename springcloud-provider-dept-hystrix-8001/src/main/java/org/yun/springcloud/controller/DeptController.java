package org.yun.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.yun.springcloud.pojo.Dept;
import org.yun.springcloud.service.DeptService;


@RestController  //提供RestFul服务
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(defaultFallback = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("id=>" + id + ",不存在该用户，或者信息无法找到～");
        }
        return dept;
    }

    //备选方案 我是Hystrix体现出来的
    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("id=>"+id+"没有对应的信息,null")
                .setDb_source("没有对应的数据库");
    }

}
