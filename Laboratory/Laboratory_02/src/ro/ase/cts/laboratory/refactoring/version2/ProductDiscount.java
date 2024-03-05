package ro.ase.cts.laboratory.refactoring.version2;

public class ProductDiscount {
	public float getFinalPrice(int productType, float initialPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountExtraDiscount = (accountAgeInYears > 10) ? (float)15/100 : (float)accountAgeInYears/100; 
	    if (productType == 1)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == 2)
	    {
	      finalPrice = (initialPrice - (0.1f * initialPrice)) - accountExtraDiscount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	      finalPrice = (initialPrice - (0.25f * initialPrice)) - accountExtraDiscount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	      finalPrice = (initialPrice - (0.35f * initialPrice)) - accountExtraDiscount * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	  }
}
