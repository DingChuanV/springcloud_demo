package org.yun.springcloud.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yun.springcloud.pojo.Dept;
import org.yun.springcloud.service.DeptService;

import java.util.List;

@RestController  //提供RestFul服务
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * @param dept
     * @return
     */
    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryByAll() {
        return deptService.queryAll();
    }

    //注册进来的微服务～，获取一些消息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery=>services:"+services);
        //得到具体的微服务
        return this.discoveryClient;
    }

}
