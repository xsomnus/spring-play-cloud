package spring.diy.bean;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 17:56
 */
public interface BeanDefinitionRegistry {

    void register(BeanDefinition bd, String beanName);

    boolean containsBeanDefinition(String beanName);

    BeanDefinition getBeanDefinition(String beanName);
}
