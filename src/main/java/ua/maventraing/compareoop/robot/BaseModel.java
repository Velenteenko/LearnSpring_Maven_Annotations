package ua.maventraing.compareoop.robot;

import ua.maventraing.compareoop.interfaces.Hand;
import ua.maventraing.compareoop.interfaces.Head;
import ua.maventraing.compareoop.interfaces.Leg;
import ua.maventraing.compareoop.interfaces.Robot;

public abstract class BaseModel implements Robot {

	private Hand hand;
	private Head head;
	private Leg leg;

	public BaseModel() {
		System.out.println(this + " BaseModel - Constructor()");
	}

	public BaseModel(Head head, Hand hand, Leg leg) {
		this();
		this.hand = hand;
		this.head = head;
		this.leg = leg;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

}
