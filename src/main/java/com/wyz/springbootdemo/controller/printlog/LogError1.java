package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogError1 {
    @GetMapping("error1")
    public String error1() {
        log.error("error1");
        return "error1";
    }
}
