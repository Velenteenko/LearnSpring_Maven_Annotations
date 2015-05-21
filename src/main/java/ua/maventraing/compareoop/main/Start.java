package ua.maventraing.compareoop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.maventraing.compareoop.robot.ModelT1000;

public class Start {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT1000 model1 = (ModelT1000) context.getBean("model1");
		model1.fire();
		System.out.println("Get new ModelT1000 from context: " + model1);

		System.out.println("");

		ModelT1000 model2 = (ModelT1000) context.getBean("model2");
		model2.fire();
		System.out.println("Get new ModelT1000 from context: " + model1);
	}

}
