package ro.ase.ie.cts.design.patterns.factory;

public abstract class AbstractSpaceObject {

	String name;
	
	public AbstractSpaceObject(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void doAction();
}
