package ro.ase.ie.cts.design.patterns.factory;

public class AllienSpaceShip extends AbstractSpaceObject{

	float laserPower;
	String race;
	
	public AllienSpaceShip(
			String name, float laserStrength, String race) {
		super(name);
		this.laserPower = laserStrength;
		this.race = race;
	}

	@Override
	public void doAction() {
		System.out.println("Allien spaceship is shooting its lasers");
	}

	public float getLaserPower() {
		return laserPower;
	}

	public void setLaserPower(float laserPower) {
		this.laserPower = laserPower;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	

}
