package ro.ase.ie.cts.design.patterns.factory;

public class Meteorit extends AbstractSpaceObject {

	int speed;
	
	public Meteorit(String name, int speed) {
		super(name);
		this.speed = speed;
	}

	@Override
	public void doAction() {
		System.out.println("The meteorit is moving through space");
	}

}
