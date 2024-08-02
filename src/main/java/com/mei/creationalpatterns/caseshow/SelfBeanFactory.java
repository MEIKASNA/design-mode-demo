package com.mei.creationalpatterns.caseshow;

/**
 * SelfBeanFactory
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 上午10:14
 */
public interface SelfBeanFactory {

     <T> T getBean(Class<T> classType);

     void registerBean(Object bean);
}
