package com.mei.creationalpatterns.prototypepattern.prototype;

import org.springframework.context.annotation.Bean;

/**
 * OneBean
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午5:43
 */
public class OneBean extends DefaultBean {
    @Override
    void doSomething() {
        System.out.println("OneBean doSomething");
    }
}
