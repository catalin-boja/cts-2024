package ro.ase.cts.laboratory.refactoring.version6.main;

import ro.ase.cts.laboratory.refactoring.version6.ProductDiscount;
import ro.ase.cts.laboratory.refactoring.version6.ProductType;
import ro.ase.cts.laboratory.refactoring.version6.Spring2024MarketingStrategy;
import ro.ase.cts.laboratory.refactoring.version6.Summer2024MarketingStrategy;

public class Test {

	public static void main(String[] args) {
		
		ProductDiscount prodDiscount = 
				new ProductDiscount(new Spring2024MarketingStrategy());
		System.out.println("Product final price is " + 
				prodDiscount.getFinalPrice(
						ProductType.NEW, 100, 10));
		
		prodDiscount.setMarketingStrategy(new Summer2024MarketingStrategy());
		
		System.out.println("Product final price is " + 
				prodDiscount.getFinalPrice(
						ProductType.NEW, 100, 10));

	}

}
