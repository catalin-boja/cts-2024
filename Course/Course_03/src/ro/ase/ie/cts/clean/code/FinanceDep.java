package ro.ase.ie.cts.clean.code;

public class FinanceDep implements IFinance{
	
	@Override
	public void payTuition(Student student){ 
		System.out.println("Pay by cash");
	}
}
