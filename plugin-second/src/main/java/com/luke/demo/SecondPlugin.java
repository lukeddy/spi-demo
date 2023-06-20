package com.luke.demo;

import com.luke.core.Plugin;

import java.util.Map;

public class SecondPlugin implements Plugin {
    public void install(Map context) {
        System.out.println("第二个插件："+SecondPlugin.class);
        context.put("second",222222);
    }
}
