package testclient;

import pkg.builder.AbstractBuilder;
import pkg.builder.concrete.ConcreteBuilderA;
import pkg.builder.concrete.ConcreteBuilderB;
import pkg.director.Director;
import pkg.product.concrete.ConcreteProduct;

/*
 * See:
 * https://www.youtube.com/watch?v=9XnsOpjclUg
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Builder");

		//
		// Product A a robot make of tin
		//

		AbstractBuilder buildRobotOfTin = new ConcreteBuilderA();
		Director directorTin = new Director(buildRobotOfTin);
		directorTin.makeRobot();
		ConcreteProduct robotOfTin = directorTin.getRobot();

		System.out.println("Robot build");
		System.out.println("Robot Head is: " + robotOfTin.getRobotHead());
		System.out.println("Robot Torso is: " + robotOfTin.getRobotTorso());
		System.out.println("Robot Arms is: " + robotOfTin.getRobotArms());
		System.out.println("Robot Legs is: " + robotOfTin.getRobotLegs());

		//
		// Product B a robot made of wood
		//

		AbstractBuilder buildRobotOfWood = new ConcreteBuilderB();
		Director directorWood = new Director(buildRobotOfWood);
		directorWood.makeRobot();
		ConcreteProduct robotOfWood = directorWood.getRobot();
		System.out.println("Robot build");
		System.out.println("Robot Head is: " + robotOfWood.getRobotHead());
		System.out.println("Robot Torso is: " + robotOfWood.getRobotTorso());
		System.out.println("Robot Arms is: " + robotOfWood.getRobotArms());
		System.out.println("Robot Legs is: " + robotOfWood.getRobotLegs());

	}
}
