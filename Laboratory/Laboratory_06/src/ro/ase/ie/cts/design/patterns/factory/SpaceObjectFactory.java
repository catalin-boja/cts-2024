package ro.ase.ie.cts.design.patterns.factory;

public class SpaceObjectFactory {

	public AbstractSpaceObject getSpaceObject(SpaceObjectType type,
			String name) {
		switch(type) {
			case ALLIEN_SPACESHIP:
			{
				return new AllienSpaceShip(name, 50, "");
			}
			case METEORIT:
			{
				return new Meteorit(name, 0);
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}
	}
	
}
