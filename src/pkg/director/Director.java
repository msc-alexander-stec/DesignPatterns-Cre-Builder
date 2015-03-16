package pkg.director;

import pkg.builder.AbstractBuilder;
import pkg.product.concrete.ConcreteProduct;

public class Director {

	private AbstractBuilder robotBuilder;

	//
	// Constructor
	//

	public Director(AbstractBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	//
	//
	//

	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}

	public ConcreteProduct getRobot() {
		return this.robotBuilder.getRobot();
	}

}
