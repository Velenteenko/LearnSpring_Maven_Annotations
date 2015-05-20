package ua.maventraing.compareoop.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//похоже на создание фильтров для WEB JSF
public class BeanPostProc implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// System.out.println(arg0 + " postProcessAfterInitialization()");
		return arg0;
		// return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// System.out.println(arg0 + " postProcessBeforeInitialization()");
		return arg0;
		// return null;
	}

}
