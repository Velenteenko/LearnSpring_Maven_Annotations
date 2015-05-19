package ua.maventraing.compareoop.actions;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ActionReplaser implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		System.out.println("New action for ModelT1000 instead of fire() method!");

		return null;
	}

}
