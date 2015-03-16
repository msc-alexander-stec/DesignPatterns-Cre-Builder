package pkg.product.concrete;

import pkg.product.abstr.AbstractProduct;

public class ConcreteProduct implements AbstractProduct {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	//
	// Setter
	//
	
	@Override
	public void setRobotHead(String head) {
		robotHead = head;
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		robotArms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		robotLegs = legs;
	}

	//
	// Getter
	//
	
	public String getRobotHead() {
		return robotHead;
	}
	
	public String getRobotTorso() {
		return robotTorso;
	}
	
	public String getRobotArms() {
		return robotArms;
	}
	
	public String getRobotLegs() {
		return robotLegs;
	}
}
