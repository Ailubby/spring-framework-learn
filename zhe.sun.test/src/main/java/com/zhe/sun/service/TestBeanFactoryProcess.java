package com.zhe.sun.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhe.sun
 * @date 2020/2/11 18:38
 */
@Component
public class TestBeanFactoryProcess implements BeanFactoryPostProcessor {

	/**
	 * Man 中 son 为什么不会自动注入
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Map<String, Man> map = beanFactory.getBeansOfType(Man.class);
	}
}
