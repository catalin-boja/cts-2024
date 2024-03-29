package ro.ase.csie.cts.course.design.patterns.builder.initial;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;
import ro.ase.csie.cts.course.design.patterns.builder.module.TelCoSIMCard;

public class TestBuilder {

	public static void main(String[] args) {
		
		
		//this is not an atomic operation
		
		//1. create the empty object
		SmartDevice smartPhone = new SmartDevice();
		
		//2. init the object with values
		//TODO: don't forget to init the attributes
		smartPhone.setProducator("Apple");
		smartPhone.setCardMemorie(new SDCard(64));
		//init the others ones
		//what will happen if you forget to init one of the attributes ?
		
		
		//this is an atomic operation
		
		SmartDevice smartPhone2 = 
				new SmartDevice("S10", "Samsung", true, 
						new TelCoSIMCard(), null, new DisplaySuperAmoled(7), null);
		SmartDevice smartPhone3 = 
				new SmartDevice("", "", false, null, null, null, null);
		SmartDevice smartPhone4 = 
				new SmartDevice("Samsung", "S10", false, null, null, null, null);
		
	}

}
