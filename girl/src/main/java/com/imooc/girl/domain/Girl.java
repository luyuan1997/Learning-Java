package com.imooc.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
//该注解表示该类就是数据库的一个表
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    @Min(value=18, message = "未成年少女禁止入内")
    //该注解用于对某个参数进行设置范围
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
