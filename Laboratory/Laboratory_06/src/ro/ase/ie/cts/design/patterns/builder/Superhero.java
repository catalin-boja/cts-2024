package ro.ase.ie.cts.design.patterns.builder;

public class Superhero {
	
	String name;
	int lifePoints;
	float strength;
	
	String leftHandWeapon;
	String rightHandWeapon;
	
	boolean isCriticalWounded;
	
	String superPower;
	String superSuperPower;
	
	//ctors are private
	//setters are private
	
	private Superhero() {
		
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	private void setStrength(float strength) {
		this.strength = strength;
	}

	private void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	private void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	private void setCriticalWounded(boolean isCriticalWounded) {
		this.isCriticalWounded = isCriticalWounded;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	private void setSuperSuperPower(String superSuperPower) {
		this.superSuperPower = superSuperPower;
	}
	
	
	public static class SuperheroBuilder {
		
		//eager version
		private Superhero superhero;
		
		public SuperheroBuilder(String name, int strength) {
			superhero = new Superhero();
			superhero.setName(name);
			superhero.setStrength(strength);
		}
		
		public SuperheroBuilder addLeftHandWeapon(String weapon) {
			superhero.setLeftHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder addRightHandWeapon(String weapon) {
			superhero.setRightHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder addSuperpower(String power) {
			superhero.setSuperPower(power);
			return this;
		}
		
		//for the rest of the attributes
		
		
		public Superhero build() {
			return superhero;
		}
		
	}

}
