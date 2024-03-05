package ro.ase.cts.laboratory.refactoring.version4;

public class ProductDiscount {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static final float MAX_ACCOUNT_EXTRA_DISCOUNT = 0.15f;
	
	public static final float NO_DISCOUNT = 0.0f;
	public static final float NORMAL_DISCOUNT = 0.1f;
	public static final float CLASSIC_DISCOUNT = 0.25f;
	public static final float CLEARANCE_DISCOUNT = 0.35f;
	
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
	    
	    float accountExtraDiscount = 
	    		getAccountExtraDiscount(accountAgeInYears);
	    		
	    switch(productType) {
	    	case NEW:
	    		priceWithDiscount = getPriceWithDiscount(initialPrice, NO_DISCOUNT);
	    		accountExtraDiscount = 0;
	    		break;
	    	case NORMAL:
	    		priceWithDiscount = getPriceWithDiscount(initialPrice, NORMAL_DISCOUNT);    		
	    		break;
	    	case DISCOUNT:
	    		priceWithDiscount = getPriceWithDiscount(initialPrice, CLASSIC_DISCOUNT);    		
	    		break;
	    	case CLEARANCE:
	    		priceWithDiscount = getPriceWithDiscount(initialPrice, CLEARANCE_DISCOUNT);
	    		break;
	    	default:
	    		throw new UnsupportedOperationException("The new product type is not covered");
	    }
	
	    finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    
	    return finalPrice;
	  }
}
