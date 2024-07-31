package com.mei.creationalpatterns.prototypepattern.cache;

import com.mei.creationalpatterns.prototypepattern.prototype.DefaultBean;
import com.mei.creationalpatterns.prototypepattern.prototype.OneBean;
import com.mei.creationalpatterns.prototypepattern.prototype.TwoBean;

import java.util.Hashtable;

/**
 * BeanCache
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午5:44
 */
public class BeanCache {
    private static final Hashtable<String, DefaultBean> beanCache = new Hashtable<>();

    // 获得原型的克隆对象
    public static DefaultBean getBean(String beanName) {
        return (DefaultBean) beanCache.get(beanName).clone();
    }

    // 获得原型对象
    public static DefaultBean getBeanPrototype(String beanName) {
        return  beanCache.get(beanName);
    }

    // 静态代码块，初始化beanCache
    static  {
        OneBean oneBean = new OneBean();
        TwoBean twoBean = new TwoBean();
        beanCache.put(oneBean.getClass().getName(), oneBean);
        beanCache.put(twoBean.getClass().getName(), twoBean);
    }
}

