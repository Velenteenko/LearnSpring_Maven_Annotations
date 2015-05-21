package ua.maventraing.compareoop.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ua.maventraing.compareoop.abstracts.BaseModel;
import ua.maventraing.compareoop.enums.ColorSelector;
import ua.maventraing.compareoop.interfaces.Hand;
import ua.maventraing.compareoop.interfaces.Head;
import ua.maventraing.compareoop.interfaces.Leg;

@Configuration
// @Qualifier(value = "model1")
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

	// private Hand hand;
	// private Head head;
	// private Leg leg;

	private ColorSelector color;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model1() {
		System.out.println("Return new object ModelT1000()");
		return new ModelT1000();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model2() {
		System.out.println("Return new object ModelT1000()");
		return new ModelT1000(ColorSelector.BLACK, 2007, true);
	}

	// public ModelT1000(Head head, Hand hand, Leg leg) {
	// super();
	// this.head = head;
	// this.hand = hand;
	// this.leg = leg;
	// }

	public ModelT1000(ColorSelector color, int year, boolean soundEnabled) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	// public ModelT1000(Head head, Hand hand, Leg leg) {
	// super(head, hand, leg);
	// // TODO Auto-generated constructor stub
	// }

	public ModelT1000(Head head, Hand hand, Leg leg, ColorSelector color, int year, boolean soundEnabled) {
		// super(head, hand, leg);
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	// public Hand getHand() {
	// return hand;
	// }
	//
	// public void setHand(Hand hand) {
	// this.hand = hand;
	// }
	//
	// public Head getHead() {
	// return head;
	// }
	//
	// public void setHead(Head head) {
	// this.head = head;
	// }
	//
	// public Leg getLeg() {
	// return leg;
	// }
	//
	// public void setLeg(Leg leg) {
	// this.leg = leg;
	// }

	public ColorSelector getColor() {
		return color;
	}

	public void setColor(ColorSelector color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		getHead().thinking();
		getHand().inintHands();
		getHand().catchSomething();
		getLeg().initLegs();
		getLeg().go();
		System.out.println("T1000: Fire in the hool!!!");
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("can play Sound: " + soundEnabled);
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("T1000 is dancing!");
	}

	public void initObject() {
		System.out.println("Init object T1000");
	}

	public void destroyObject() {
		System.out.println("Destroy object T1000");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this + " - init()");
	}

}
