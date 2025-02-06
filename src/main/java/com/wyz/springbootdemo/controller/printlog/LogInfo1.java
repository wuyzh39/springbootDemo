package com.wyz.springbootdemo.controller.printlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogInfo1 {
    @GetMapping("info1")
    public String info1() {
        log.info("info1");
        return "info1";
    }
}
