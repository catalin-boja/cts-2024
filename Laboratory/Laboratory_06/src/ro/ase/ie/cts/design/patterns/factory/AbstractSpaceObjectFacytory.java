package ro.ase.ie.cts.design.patterns.factory;

public abstract class AbstractSpaceObjectFacytory {
	public abstract AbstractSpaceObject getSpaceObject(
			SpaceObjectType type, String name);
}
