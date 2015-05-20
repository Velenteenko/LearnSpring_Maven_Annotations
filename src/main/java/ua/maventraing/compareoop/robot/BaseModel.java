package ua.maventraing.compareoop.robot;

import org.springframework.beans.factory.annotation.Autowired;

import ua.maventraing.compareoop.interfaces.Hand;
import ua.maventraing.compareoop.interfaces.Head;
import ua.maventraing.compareoop.interfaces.Leg;
import ua.maventraing.compareoop.interfaces.Robot;

public abstract class BaseModel implements Robot {

	@Autowired
	private Hand hand;
	@Autowired
	private Head head;
	@Autowired
	private Leg leg;

	public BaseModel() {
		System.out.println(this + " BaseModel - Constructor()");
	}

	// @Autowired
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
