package ro.ase.ie.cts.design.patterns.builder;

public class Test {

	public static void main(String[] args) {
		
		//option 1
		SuperheroInitial superman = 
				new SuperheroInitial();
		//TODO: don't forget to init the required attributes
		superman.setName("Superman");
		
		
		//option 2
		SuperheroInitial superman2 = 
				new SuperheroInitial("Superman", 100);
		//TODO: don't forget to init the other required attributes
		superman2.setLeftHandWeapon("Pistol");
		
		//option 3
		SuperheroInitial superman3 = 
				new SuperheroInitial(
						"Superman", 100, 100, "", "", 
						false, "Laser eyes", "Fly");
		
		
		//with the builder
		Superhero superman4 = 
				new Superhero.SuperheroBuilder("Superman", 100)
				.addLeftHandWeapon("Pistol")
				.addSuperpower("Laser eyes")
				.build();
		
	}

}
