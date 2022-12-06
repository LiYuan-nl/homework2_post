package com.example.homework2_post.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping (value =  "/index" )
    public Integer SUM_ab(Integer a,Integer b){
        Integer sum;
        sum = a + b;
        System.out.println("a + b = " + sum);
        return sum;
    }
}
