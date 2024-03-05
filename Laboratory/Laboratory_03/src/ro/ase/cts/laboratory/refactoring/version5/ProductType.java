package ro.ase.cts.laboratory.refactoring.version5;

public enum ProductType {
	NEW("New", 0.0f), 
	NORMAL("Normal", 0.1f), 
	DISCOUNT("Classic discount", 0.25f), 
	CLEARANCE("Clearance", 0.35f);
	
	private float discount;
	private String name;
	
	private ProductType(String name, float discount) {
		this.name = name;
		this.discount = discount;
	}

	public float getDiscount() {
		return discount;
	}

	public String getName() {
		return name;
	}
	
	
}
