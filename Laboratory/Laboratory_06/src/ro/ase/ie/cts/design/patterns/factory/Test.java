package ro.ase.ie.cts.design.patterns.factory;

public class Test {

	public static void main(String[] args) {
		
		SpaceObjectFactory spaceFactory = 
				new SpaceObjectFactory();
		
		AllienSpaceShip spaceship = 
				(AllienSpaceShip) spaceFactory.getSpaceObject(
						SpaceObjectType.ALLIEN_SPACESHIP, "Romulan Bird");
		
		Meteorit meteorit = 
				(Meteorit) spaceFactory.getSpaceObject(
						SpaceObjectType.METEORIT, "PT23");
		
		//extra details are set later
		spaceship.setLaserPower(150);
		
		spaceship.doAction();
		meteorit.doAction();
	}

}
