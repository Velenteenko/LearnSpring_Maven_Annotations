package ua.maventraing.compareoop.pools;

import java.util.Collection;

import ua.maventraing.compareoop.interfaces.Robot;
import ua.maventraing.compareoop.interfaces.RobotPool;

public class T1000robotPool implements RobotPool {

	private Collection<Robot> robotCollection;

	@Override
	public Collection<Robot> getRobotPool() {

		return robotCollection;
	}

	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	public void actionInPool() {
		for (Robot robot : robotCollection) {
			robot.fire();
			System.out.println("");
		}
	}

}
