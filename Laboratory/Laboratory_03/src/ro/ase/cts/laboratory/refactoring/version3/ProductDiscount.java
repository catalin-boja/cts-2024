package ro.ase.cts.laboratory.refactoring.version3;

public class ProductDiscount {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static final float MAX_ACCOUNT_EXTRA_DISCOUNT = 0.15f;
	
	public static final float NORMAL_DISCOUNT = 0.1f;
	public static final float CLASSIC_DISCOUNT = 0.25f;
	public static final float CLEARANCE_DISCOUNT = 0.35f;
	
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float priceWithDiscount = 0;
	    
	    float accountExtraDiscount = 
	    		(accountAgeInYears > MIN_ACCOUNT_AGE) ? MAX_ACCOUNT_EXTRA_DISCOUNT : (float)accountAgeInYears/100; 
	     
	    switch(productType) {
	    	case NEW:
	    		finalPrice = initialPrice;
	    		break;
	    	case NORMAL:
	    		priceWithDiscount = initialPrice - (NORMAL_DISCOUNT * initialPrice);
	    		finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    		break;
	    	case DISCOUNT:
	    		priceWithDiscount = initialPrice - (CLASSIC_DISCOUNT * initialPrice);
	    		finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    		break;
	    	case CLEARANCE:
	    		priceWithDiscount = initialPrice - (CLEARANCE_DISCOUNT * initialPrice);
	    		finalPrice = (1 - accountExtraDiscount) * priceWithDiscount;
	    		break;
	    	default:
	    		throw new UnsupportedOperationException("The new product type is not covered");
	    }
	
	    return finalPrice;
	  }
}
