package com.luke.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;

public class PluginFactory {

    /**
     * 定义上下文对象，用于数据传递。比如：将各种配置信息放入其中
     */
    private HashMap<String, Object> context = new HashMap<>();


    public void installPlugins(){
        context.put("application","JAVA SPI机制实现可插拔插件示例");
        context.put("version","1.0.0");
        context.put("other","模拟其他信息");

        //使用SPI机制加载所有实现Plugin的类
        ServiceLoader<Plugin> loader=ServiceLoader.load(Plugin.class);
        Iterator<Plugin> iterator = loader.iterator();
        while (iterator.hasNext()){
            Plugin plugin  = iterator.next();
            plugin.install(context);
        }
    }

    public void setContext(HashMap<String, Object> context) {
        this.context = context;
    }

    public HashMap<String, Object> getContext() {
        return context;
    }
}
