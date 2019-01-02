package spring.diy.bean;


import org.apache.commons.lang3.StringUtils;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 14:40
 */
public interface BeanDefinition {

    String SINGLETON = "singleton";
    String PROTOTYPE = "prototype";

    Class<?> getBeanClass();

    String getBeanName();

    String getBeanFactory();

    String getCreateBeanMethod();

    String getStaticCreateBeanMethod();

    String getBeanInitMethodName();

    String getBeanDestroyMethodName();

    String getScope();

    boolean isSingleton();

    boolean isPrototype();

    default boolean validate() {
        if (getBeanClass() != null) {
            if (StringUtils.isBlank(getBeanFactory()) && StringUtils.isBlank(getCreateBeanMethod())) {
                return false;
            }
        }
        return true;
    }
}
