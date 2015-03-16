package pkg.builder.concrete;

import pkg.builder.AbstractBuilder;
import pkg.product.concrete.ConcreteProduct;

public class ConcreteBuilderA implements AbstractBuilder {

	private ConcreteProduct concreteProductRobotOfTin;

	//
	// Constructor
	//

	public ConcreteBuilderA() {
		this.concreteProductRobotOfTin = new ConcreteProduct();
	}

	//
	//
	//

	@Override
	public void buildRobotHead() {
		concreteProductRobotOfTin.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		concreteProductRobotOfTin.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		concreteProductRobotOfTin.setRobotArms("Tin Arms");
	}

	@Override
	public void buildRobotLegs() {
		concreteProductRobotOfTin.setRobotLegs("Tin Legs");
	}

	@Override
	public ConcreteProduct getRobot() {
		return this.concreteProductRobotOfTin;
	}

}