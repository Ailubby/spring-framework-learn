package com.zhe.sun.service;

		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.stereotype.Component;

/**
 * @author zhe.sun
 * @date 2019/12/7 10:49
 */
@Component
public class Man {

	@Autowired
	private Son son;

	public void print() {
		son.hello();
	}


}
