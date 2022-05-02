package org.yun.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 在网络传输中，实体类最好都序列化
 * 序列化是把对象转换成字节数组可以传输和持久化
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable { //Dept 实体类 orm 类表关系映射

    private Long deptno;
    private String dname;
    //这个数据库存在在那个数据库的字段～ 微服务，一个服务对应一个数据库
    //同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }


}
