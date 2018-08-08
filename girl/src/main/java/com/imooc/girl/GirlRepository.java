package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //其中Girl指的是数据类型，Integer为ID的类型值
    //通过年龄来查询数据
    public List<Girl> findByAge(Integer age);
}
