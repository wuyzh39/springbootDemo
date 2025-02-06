package com.wyz.springbootdemo.wrapper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.HashMap;
import java.util.Map;

public class CustomResponseWrapper extends HttpServletResponseWrapper {

    private final Map<String, String> attributesMap;

    public CustomResponseWrapper(HttpServletResponse response) {
        super(response);
        this.attributesMap = new HashMap<>();
    }

    public void setCustomAttribute(String key, String value) {
        attributesMap.put(key, value);
    }

    public String getCustomAttribute(String key) {
        return attributesMap.get(key);
    }
}
