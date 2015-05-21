package ua.maventraing.compareoop.spares.sonyspares;

import org.springframework.stereotype.Component;

import ua.maventraing.compareoop.interfaces.Leg;

@Component
// @Lazy
public class SonyLeg implements Leg {

	public void initLegs() {
		System.out.println("Init legs by Sony... First leg init...Second leg init... Init complete...");

	}

	public void go() {
		System.out.println("Go by Sony!!!");

	}

}
