package com.mei.creationalpatterns.caseshow;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 上午11:13
 */
public class Entrance {
    public static void main(String[] args) {
        Bean bean = new Bean();
        SelfBeanContext selfBeanContext = new SelfBeanContext();
        SelfBeanContext selfBeanContext1 = new SelfBeanContext();
        selfBeanContext1.registerBean(bean);
        selfBeanContext.registerBean(bean);
        System.out.println(selfBeanContext1.getBean(Bean.class) == selfBeanContext.getBean(Bean.class));
    }

}
