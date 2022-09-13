package org.gene.controller;

import org.gene.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GeneController {
    /**
     *  使用这个模板来调用服务
     */
    @Autowired
    public RestTemplate restTemplate;

    /**
     *  你的服务提供者配置的是什么port，你就按照你的你来
     */
    private static final String PREFIX = "http://localhost:8001";

    @RequestMapping("/client/dept/get/{id}")
    public Dept get(@PathVariable("id") int id){
        //第一个参数是你service需要调用的url，第二个参数是返回值类型
        return restTemplate.getForObject(PREFIX + "/dept/get/" + id , Dept.class);
    }

    @RequestMapping("/client/dept/add")
    public ResponseEntity<Boolean> addDept(Dept dept){
        //第一个参数是你service需要调用的url，第二个参数是需要传递的对象，第三个参数是返回值类型
        return restTemplate.postForEntity(PREFIX + "/dept/add" , dept , Boolean.class);
    }
}
