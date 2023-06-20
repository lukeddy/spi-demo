package com.luke;

import com.luke.core.PluginFactory;

import java.util.HashMap;

/**
 * 利用Java SPI机制实现可插拔的应用
 */
public class Application {
    public static void main(String[] args) {
        PluginFactory pluginFactory = new PluginFactory();
        HashMap<String, Object> context = pluginFactory.getContext();
        context.put("test-config","hello spi");
        pluginFactory.installPlugins();
        System.out.println("--------------");
        System.out.println(pluginFactory.getContext());
    }
}
