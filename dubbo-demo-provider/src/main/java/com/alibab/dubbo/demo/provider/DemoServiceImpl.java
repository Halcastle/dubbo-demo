package com.alibab.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;

/**
 * @ClassName DemoServiceImpl
 * @Description TODO
 * @Author pwang6
 * @Date 2021/11/5 17:25
 * @Version 1.0
 **/
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
