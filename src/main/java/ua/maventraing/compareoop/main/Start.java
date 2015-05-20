package ua.maventraing.compareoop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.maventraing.compareoop.robot.ModelT1000;

public class Start {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.fire();
	}

}
