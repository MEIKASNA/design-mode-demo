package com.mei.creationalpatterns.prototypepattern.prototype;

/**
 * DefaultBean
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午5:38
 */
public abstract class DefaultBean implements Cloneable {

    abstract void doSomething();

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
