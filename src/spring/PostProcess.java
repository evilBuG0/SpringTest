package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcess implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("正在进行初始化之后的处理");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("正在进行初始化之前的处理");
		return bean;
	}

}
