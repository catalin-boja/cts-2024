package ro.ase.cts.laboratory.refactoring.version6;

public interface IMarketingStrategy {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static final float MAX_ACCOUNT_EXTRA_DISCOUNT = 0.15f;
	
	public float getAccountExtraDiscount(int accountAgeInYears);
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears);
	
	public default float getPriceWithDiscount(float initialPrice, float discount) {
		return initialPrice - (discount * initialPrice);
	}
}
