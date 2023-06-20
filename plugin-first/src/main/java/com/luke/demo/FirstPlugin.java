package com.luke.demo;

import com.luke.core.Plugin;

import java.util.Map;

public class FirstPlugin implements Plugin {
    public void install(Map context) {
        System.out.println("第一个插件："+FirstPlugin.class);
        context.put("first",111111);
        System.out.println(context);
    }
}
