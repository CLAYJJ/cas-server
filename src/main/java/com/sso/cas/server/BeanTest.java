package com.sso.cas.server;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 *
 * 测试spring bean的生命周期
 * @Author luo jiajia
 * @Date 2018/7/23 0023 下午 21:53
 */
public class BeanTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, BeanPostProcessor, DisposableBean {
    @Override
    public void setBeanName(String s) {
        System.out.println("1.BeanNameAware接口中setBeanName的实现");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2.BeanFactoryAware接口中setBeanFactory的实现");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3.ApplicationContextAware接口中setApplicationContext的实现");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4.InitializingBean->afterPropertiesSet");
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6.BeanPostProcessor->postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("7.BeanPostProcessor->postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("8.DisposableBean->destroy");
    }


    public void myInit(){
        System.out.println("5.my init");
    }
    public void myDestroy(){
        System.out.println("9.my destroy");
    }


}
