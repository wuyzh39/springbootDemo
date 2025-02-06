package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogError2 {
    @GetMapping("error2")
    public String error2() {
        log.error("error2");
        return "error2";
    }
}
