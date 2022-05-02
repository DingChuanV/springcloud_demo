# 🥎springcloud_demo

## 🏈SpringCloud NetFlix 组件的学习demo

Spring Cloud Netflix 
        服务发现和注册中心    Eureka（停止维护）
        服务熔断    HyStrix
        路由网关    Zuul
        负载均衡    
            客户端负载均衡       Netflix Ribbon
            服务端负载均衡       Feign(其也是依赖于Ribbon，只是将调用方式RestTemplete 更改成Service 接口)
概括而言，springcloud的五大组件包括
    Netflix Eurek           服务发现
    Netflix Ribbon          客服端负载均衡
    Netflix Hystrix         断路器
    Netflix Zuul            服务网关
    Spring Cloud Config     分布式配置
    
