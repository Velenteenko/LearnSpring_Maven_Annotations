package ua.maventraing.compareoop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.maventraing.compareoop.interfaces.Robot;
import ua.maventraing.compareoop.interfaces.RobotConveyor;

public class Start {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("All_Context.xml");
		// Object object = context.getBean("for_model_t1000");
		// Object object = context.getBean("t1000");

		// if (object instanceof ModelT1000) {
		// ModelT1000 t1000 = (ModelT1000) object;
		// // t1000.dance();
		// t1000.fire();
		// }
		// ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		// t1000.fire();
		RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();

		System.out.println("terminator 1 - " + terminator1);
		System.out.println("terminator 2 - " + terminator2);
		System.out.println("terminator 3 - " + terminator3);
	}

}
