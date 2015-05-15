package ua.maventraing.compareoop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.maventraing.compareoop.robot.ModelT1000;

public class Start {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// Object object = context.getBean("for_model_t1000");
		Object object = context.getBean("t1000");

		if (object instanceof ModelT1000) {
			ModelT1000 t1000 = (ModelT1000) object;
			// t1000.dance();
			t1000.fire();
		}

	}

}
