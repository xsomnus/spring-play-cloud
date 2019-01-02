package spring.diy.bean.impl;

import spring.diy.bean.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 17:58
 */
public class DefaultBeanDefinition implements BeanDefinition {

    private Class<?> clazz;
    private String beanName;
    private String beanFactoryName;
    private String createBeanMethodName;
    private String staticCretatedBeanMethodName;
    private String beanInitMethodName;
    private String beanDestroyMethodName;
    private boolean isSingleton;
    private Constructor constructor;
    private Method method;
    private List<?> constructorArg;
    private Map<String, Object> values;

    @Override
    public Class<?> getBeanClass() {
        return null;
    }

    @Override
    public String getBeanName() {
        return null;
    }

    @Override
    public String getBeanFactory() {
        return null;
    }

    @Override
    public String getCreateBeanMethod() {
        return null;
    }

    @Override
    public String getStaticCreateBeanMethod() {
        return null;
    }

    @Override
    public String getBeanInitMethodName() {
        return null;
    }

    @Override
    public String getBeanDestroyMethodName() {
        return null;
    }

    @Override
    public String getScope() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public boolean isPrototype() {
        return false;
    }
}
