package com.mei.creationalpatterns.caseshow;

import java.util.HashMap;

/**
 * SelfBeanContext
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 上午11:10
 */
public class SelfBeanContext implements SelfBeanFactory {

    @Override
    public <T> T getBean(Class<T> classType) {
        return SelfBeanFactoryImpl.getInstance().getBean(classType);
    }

    @Override
    public void registerBean(Object bean) {
        SelfBeanFactoryImpl.getInstance().registerBean(bean);
    }

    private static class SelfBeanFactoryImpl implements SelfBeanFactory {

        private static final HashMap<String, Object> BEANS = new HashMap<>();

        private static volatile SelfBeanFactoryImpl INSTANCE;

        private SelfBeanFactoryImpl() {}

        public static SelfBeanFactoryImpl getInstance() {
            if (INSTANCE == null) {
                synchronized (SelfBeanFactoryImpl.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new SelfBeanFactoryImpl();
                    }
                }
            }
            return INSTANCE;
        }

        @Override
        public <T> T getBean(Class<T> classType) {
            return classType.cast(BEANS.get(classType.getName()));
        }

        @Override
        public void registerBean(Object bean) {
            BEANS.put(bean.getClass().getName(), bean);
        }
    }
}
