package com.itheima.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 创建对象的工厂，主要加载配置文件创建dao、service对象
 */
public class BeanFactory {

    /**
     * 根据指定的key，读取配置文件创建对象
     * @return
     */
    public static <T> T getBean(String key,Class<T> clazz){
        try {
            // 加载Properties配置文件
            // 通过ResourceBundle加载配置文件：
            // 1. 只可以加载properties后缀的配置文件
            // 2. 只能加载类路径下的properties配置文件
            ResourceBundle bundle = ResourceBundle.getBundle("instance");
            // 根据key获取value：com.itheima.dao.impl.AccountDaoImpl
            String value = bundle.getString(key);
            // 创建对象返回
            return (T)Class.forName(value).getConstructor().newInstance();
        } catch (Exception e) {
            // 异常转型，调用者可以处理可以不处理（灵活）
            throw new RuntimeException(e);
        }
    }
}
