package ua.maventraing.compareoop.pools;

import java.util.Collection;
import java.util.Map;

import ua.maventraing.compareoop.interfaces.Robot;
import ua.maventraing.compareoop.interfaces.RobotPool;

public class T1000robotPool implements RobotPool {

	private Map<String, Robot> robotCollections;
	private Collection<Robot> robotCollectionSh;

	public T1000robotPool(Map<String, Robot> robotCollections) {
		super();
		this.robotCollections = robotCollections;
	}

	public T1000robotPool() {
	}

	public T1000robotPool(Collection<Robot> robotCollectionSh) {
		super();
		this.robotCollectionSh = robotCollectionSh;
	}

	@Override
	public Collection<Robot> getRobotCollectionSh() {
		// TODO Auto-generated method stub
		return robotCollectionSh;
	}

	@Override
	public Map<String, Robot> getRobotCollections() {
		// TODO Auto-generated method stub
		return robotCollections;
	}

	public void action() {

		for (Map.Entry<String, Robot> robotEntry : robotCollections.entrySet()) {
			System.out.println(robotEntry.getKey());
			robotEntry.getValue().fire();
			System.out.println("");
		}
	}

	public void showBegin() {
		for (Robot robot : robotCollectionSh) {
			robot.fire();
			System.out.println("");
		}
	}

	// private Collection<Robot> robotCollection;

	// @Override
	// public Collection<Robot> getRobotPool() {
	//
	// return robotCollection;
	// }
	//
	// public void setRobotCollection(Collection<Robot> robotCollection) {
	// this.robotCollection = robotCollection;
	// }
	//
	// public void actionInPool() {
	// for (Robot robot : robotCollection) {
	// robot.fire();
	// System.out.println("");
	// }
	// }

}
