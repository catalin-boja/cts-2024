package ro.ase.cts.laboratory.refactoring.version5;

public class ProductDiscount {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static final float MAX_ACCOUNT_EXTRA_DISCOUNT = 0.15f;
	
	public float getAccountExtraDiscount(int accountAgeInYears)
	{
		return (accountAgeInYears > MIN_ACCOUNT_AGE) ? MAX_ACCOUNT_EXTRA_DISCOUNT : (float)accountAgeInYears/100; 
	}
	
	public float getPriceWithDiscount(float initialPrice, float discount) {
		return initialPrice - (discount * initialPrice);
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float priceWithDiscount = 0;	    
	    float accountExtraDiscount = 0;
	    
	    if(!productType.equals(ProductType.NEW)) {
	    	accountExtraDiscount = getAccountExtraDiscount(accountAgeInYears);
	    }
	    		    
	    priceWithDiscount = getPriceWithDiscount(initialPrice, productType.getDiscount());
	  
	    finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    
	    return finalPrice;
	  }
}
