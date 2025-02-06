package com.wyz.springbootdemo;

import io.opentelemetry.exporter.internal.grpc.OkHttpGrpcExporter;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
public class OtelLogTest {

    @Test
    public void testOtelLog() {
        Logger internalLogger = Logger.getLogger(OtelLogTest.class.getName());
        ThrottlingLogger logger = new ThrottlingLogger(internalLogger);
        logger.log(
            Level.SEVERE,
            "severe log by otel logger"
        );
        log.error("error log by slf4j");
    }
}
