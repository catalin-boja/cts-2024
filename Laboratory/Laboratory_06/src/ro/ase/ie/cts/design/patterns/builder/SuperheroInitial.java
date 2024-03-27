package ro.ase.ie.cts.design.patterns.builder;

public class SuperheroInitial {
	
	String name;
	int lifePoints;
	float strength;
	
	String leftHandWeapon;
	String rightHandWeapon;
	
	boolean isCriticalWounded;
	
	String superPower;
	String superSuperPower;
	
	//option 1 provide default ctor
	public SuperheroInitial() {
		
	}
	
	//option 2 provide the ctor with all attributes
	
	public SuperheroInitial(String name, int lifePoints, float strength, String leftHandWeapon, String rightHandWeapon,
			boolean isCriticalWounded, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.strength = strength;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.isCriticalWounded = isCriticalWounded;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	//option 3 - provide a ctor with minimum values
	public SuperheroInitial(String name, float strength) {
		super();
		this.name = name;
		this.strength = strength;
	}
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public float getStrength() {
		return strength;
	}

	public void setStrength(float strength) {
		this.strength = strength;
	}

	public String getLeftHandWeapon() {
		return leftHandWeapon;
	}

	public void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	public String getRightHandWeapon() {
		return rightHandWeapon;
	}

	public void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	public boolean isCriticalWounded() {
		return isCriticalWounded;
	}

	public void setCriticalWounded(boolean isCriticalWounded) {
		this.isCriticalWounded = isCriticalWounded;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public String getSuperSuperPower() {
		return superSuperPower;
	}

	public void setSuperSuperPower(String superSuperPower) {
		this.superSuperPower = superSuperPower;
	}
	
	
	
}
