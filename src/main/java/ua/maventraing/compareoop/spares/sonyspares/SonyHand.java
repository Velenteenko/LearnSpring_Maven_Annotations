package ua.maventraing.compareoop.spares.sonyspares;

import org.springframework.stereotype.Component;

import ua.maventraing.compareoop.interfaces.Hand;

@Component
// @Lazy
public class SonyHand implements Hand {

	public void inintHands() {
		System.out.println("Init hand by Sony... First hand init... Second hand init... Init complete!!!");

	}

	public void catchSomething() {
		System.out.println("Catching by Sony!!!");
	}

}
