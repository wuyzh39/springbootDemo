package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogWarn1 {
    @GetMapping("warn1")
    public String warn1(){
        log.info("warn1");
        return "warn1";
    }
}
