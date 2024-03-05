package ro.ase.cts.laboratory.refactoring.version6;

public class Summer2024MarketingStrategy implements IMarketingStrategy{

	public static final int MIN_ACCOUNT_AGE = 5;
	public static final float MAX_ACCOUNT_EXTRA_DISCOUNT = 0.20f;
	
	@Override
	public float getAccountExtraDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MIN_ACCOUNT_AGE) ? MAX_ACCOUNT_EXTRA_DISCOUNT : (float)accountAgeInYears/100;
	}

	@Override
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) {
	    float finalPrice = 0;
	    float priceWithDiscount = 0;	    
	    float accountExtraDiscount = 0;
	    
	    accountExtraDiscount = getAccountExtraDiscount(accountAgeInYears);
	    	    
	    priceWithDiscount = getPriceWithDiscount(initialPrice, productType.getDiscount());
	  
	    finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    
	    return finalPrice;
	}
}
