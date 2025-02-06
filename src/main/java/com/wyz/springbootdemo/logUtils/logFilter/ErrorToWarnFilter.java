package com.wyz.springbootdemo.logUtils.logFilter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;

import java.util.HashSet;
import java.util.Set;

public class ErrorToWarnFilter extends AbstractMatcherFilter<ILoggingEvent> {
    private Set<String> targetClassNameList = new HashSet<>();

    public void addTargetClassName(String className) {
        targetClassNameList.add(className.trim());
    }


    @Override
    public FilterReply decide(ILoggingEvent event) {
//        if (targetClassNameList.contains(event.getLoggerName())) {
//
//        }
        System.out.println("[ErrorToWarnFilter] " + event.getLoggerName());
        return FilterReply.NEUTRAL;
    }


}
