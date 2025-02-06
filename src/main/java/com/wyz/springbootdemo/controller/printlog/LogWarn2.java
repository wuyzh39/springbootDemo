package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogWarn2 {
    @GetMapping("warn2")
    public String warn2(){
        log.info("warn2");
        return "warn2";
    }
}
