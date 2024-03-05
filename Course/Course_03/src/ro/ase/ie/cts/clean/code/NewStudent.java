package ro.ase.ie.cts.clean.code;

public class NewStudent extends Student{

	protected String address;
	
	public NewStudent(IFinance financeDep) {
		super(financeDep);
		// TODO Auto-generated constructor stub
	}

	@Override
	void payTuition() {
		super.payTuition();
		System.out.println("Send receipt");
	}
	
	

}
