package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogDebug1 {
    @GetMapping("debug1")
    public String debug1(){
        log.debug("debug1");
        return "debug1";
    }
}
