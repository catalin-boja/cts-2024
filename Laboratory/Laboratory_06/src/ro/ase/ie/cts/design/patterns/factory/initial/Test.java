package ro.ase.ie.cts.design.patterns.factory.initial;

import ro.ase.ie.cts.design.patterns.factory.AbstractSpaceObject;
import ro.ase.ie.cts.design.patterns.factory.AllienSpaceShip;
import ro.ase.ie.cts.design.patterns.factory.Meteorit;

public class Test {

	public static void main(String[] args) {
		
		AbstractSpaceObject allien = 
				new AllienSpaceShip("The Borg", 100, "Borg");
		Meteorit meteorit = 
				new Meteorit("GT-236", 600);
		
		allien.doAction();
		meteorit.doAction();
	}

}
