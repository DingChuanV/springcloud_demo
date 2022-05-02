package org.yun.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.yun.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author wanglufei
 * @title: DeptClientServiceFallbackFactory
 * @projectName springcloud
 * @description: TODO
 * @date 2021/9/77:03 下午
 */
//服务降级
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        . setDeptno(id)
                        .setDname("id=>" + id + "没有这个信息,客户端提供了降级的服务，这个已关闭")
                        .setDb_source("没有对应的数据库");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
