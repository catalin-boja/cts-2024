package ro.ase.cts.laboratory.refactoring.version6;

public class ProductDiscount {

	IMarketingStrategy marketingStrategy;
	
	
	//setter injection
	public void setMarketingStrategy(IMarketingStrategy marketingStrategy) {
		this.marketingStrategy = marketingStrategy;
	}
	
	//constructor injection
	public ProductDiscount(IMarketingStrategy marketingStrategy) {
		super();
		this.marketingStrategy = marketingStrategy;
	}


	public float getPriceWithDiscount(float initialPrice, float discount) {
		return initialPrice - (discount * initialPrice);
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	{
		if(this.marketingStrategy != null) {
			//do a callback to the current mk strategy
			return this.marketingStrategy.getFinalPrice(productType, initialPrice, accountAgeInYears);
		} else {
			throw new UnsupportedOperationException("Missing marketing strategy");
		}
	}
}
