package com.jiyang.statistics;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class Test {

    @PostMapping("/getResult")
    public String getResult() {
        return "success";
    }
}
