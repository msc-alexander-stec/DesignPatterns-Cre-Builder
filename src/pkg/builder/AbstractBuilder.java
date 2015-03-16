package pkg.builder;

import pkg.product.concrete.ConcreteProduct;

public interface AbstractBuilder {

	public void buildRobotHead();

	public void buildRobotTorso();

	public void buildRobotArms();

	public void buildRobotLegs();

	public ConcreteProduct getRobot();

}
