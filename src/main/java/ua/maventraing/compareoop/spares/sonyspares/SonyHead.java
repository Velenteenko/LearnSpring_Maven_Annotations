package ua.maventraing.compareoop.spares.sonyspares;

import org.springframework.stereotype.Component;

import ua.maventraing.compareoop.interfaces.Head;

@Component
// @Lazy
public class SonyHead implements Head {

	public void thinking() {
		System.out.println("Init boot by Sony!");

	}

}
