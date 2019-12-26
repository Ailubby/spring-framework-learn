package com.zhe.sun.test;

import com.zhe.sun.app.AppConfig;
import com.zhe.sun.service.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhe.sun
 * @Description: TODO
 * @date 2019/12/7 10:50
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotationContext.getBean(Man.class));


		/*ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		System.out.println(xmlContext.getBean(Man.class));*/
	}
}

