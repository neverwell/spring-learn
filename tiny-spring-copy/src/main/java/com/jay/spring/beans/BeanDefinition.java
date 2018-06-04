package com.jay.spring.beans;

/**
 * Created by xiang.wei on 2018/6/4
 *
 * @author xiang.wei
 */
public class BeanDefinition {
    private Object bean;

    private Class beanClass;
    private String beanClassName;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }
}