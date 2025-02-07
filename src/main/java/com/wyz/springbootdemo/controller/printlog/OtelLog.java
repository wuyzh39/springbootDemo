package com.wyz.springbootdemo.controller.printlog;

import io.opentelemetry.sdk.internal.ThrottlingLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@Slf4j
public class OtelLog {

    @GetMapping("otel-error")
    public String otelError() {
        Logger internalLogger = Logger.getLogger("JavaOriginLogger");
        ThrottlingLogger logger = new ThrottlingLogger(internalLogger);
        logger.log(
            Level.SEVERE,
            "severe log by otel logger"
        );
        log.error("error log by slf4j");
        return "otel error";
    }
}
