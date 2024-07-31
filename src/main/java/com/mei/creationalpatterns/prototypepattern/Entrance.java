package com.mei.creationalpatterns.prototypepattern;

import com.mei.creationalpatterns.prototypepattern.cache.BeanCache;
import com.mei.creationalpatterns.prototypepattern.prototype.DefaultBean;
import com.mei.creationalpatterns.prototypepattern.prototype.OneBean;
import com.mei.creationalpatterns.prototypepattern.prototype.TwoBean;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午5:48
 */
public class Entrance {
    public static void main(String[] args) {
        DefaultBean oneBean1 = BeanCache.getBean(OneBean.class.getName());
        DefaultBean oneBean2 = BeanCache.getBean(OneBean.class.getName());
        System.out.println(oneBean1 == oneBean2); // 由于在 cache 中是采用的调用 bean 的原型 clone 方法 所以内存地址不同
        DefaultBean beanPrototype = BeanCache.getBeanPrototype(TwoBean.class.getName());
        DefaultBean beanPrototype1 = BeanCache.getBeanPrototype(TwoBean.class.getName());
        System.out.println(beanPrototype == beanPrototype1);// 由于在 cache 中是采用的调用 bean 的原型 所以内存地址相同同
    }
}
