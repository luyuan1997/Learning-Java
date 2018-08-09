package com.imooc.girl.controller;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.repository.GirlRepository;
import com.imooc.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value="/girls")
    //用于获取女孩子的列表
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 对列表内容进行增添
     */
    //当参数过多的时候，就需要将@RequestParam("cupSize") String cupSize,
    ////                        @RequestParam("age") Integer age等全部删除，换成Girl girl，在Girl程序中对参数进行设置
//    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
//                        @RequestParam("age") Integer age){
//        Girl girl = new Girl();
//        girl.setCupSize(cupSize);
//        girl.setAge(age);
//        //对上述操作进行保存
//        return girlRepository.save(girl);
//    }
    public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult){
        //其中@Valid是为了表示有限制值，BindingResult显示是否满足范围，如果不满足，那么就显示出问题原因，并且返回null
        if (bindingResult.hasErrors()){
            System.out.print(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return girlRepository.save(girl);
    }


    //查询对象
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findById(id).get();
    }

    //更新对象

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    //删除对象
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    //通过年龄来查找数据
    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    //通过事务管理实现要么同时插入两个数据，要么一个数据都不能插入
    @PostMapping(value="/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
