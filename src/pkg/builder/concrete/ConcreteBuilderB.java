package pkg.builder.concrete;

import pkg.builder.AbstractBuilder;
import pkg.product.concrete.ConcreteProduct;

public class ConcreteBuilderB implements AbstractBuilder {

	private ConcreteProduct concreteProductRobotOfWood;

	//
	// Constructor
	//

	public ConcreteBuilderB() {
		this.concreteProductRobotOfWood = new ConcreteProduct();
	}

	//
	//
	//

	@Override
	public void buildRobotHead() {
		concreteProductRobotOfWood.setRobotHead("Wood Head");
	}

	@Override
	public void buildRobotTorso() {
		concreteProductRobotOfWood.setRobotTorso("Wood Torso");
	}

	@Override
	public void buildRobotArms() {
		concreteProductRobotOfWood.setRobotArms("Wood Arms");
	}

	@Override
	public void buildRobotLegs() {
		concreteProductRobotOfWood.setRobotLegs("Wood Legs");
	}

	@Override
	public ConcreteProduct getRobot() {
		return this.concreteProductRobotOfWood;
	}

}
