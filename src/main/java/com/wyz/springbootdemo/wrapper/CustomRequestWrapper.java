package com.wyz.springbootdemo.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.Map;

public class CustomRequestWrapper extends HttpServletRequestWrapper {

    private final Map<String, String> attributesMap;

    public CustomRequestWrapper(HttpServletRequest request) {
        super(request);
        this.attributesMap = new HashMap<>();
    }

    public void setCustomAttribute(String key, String value) {
        attributesMap.put(key, value);
    }

    public String getCustomAttribute(String key) {
        return attributesMap.get(key);
    }
}
