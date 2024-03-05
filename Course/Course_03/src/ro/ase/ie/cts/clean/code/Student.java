package ro.ase.ie.cts.clean.code;

public class Student {
	
	IFinance financeDep;
	
	//setter injection
	public void setFinanceDep(IFinance financeDep) {
		this.financeDep = financeDep;
	}
	
	//constructor injection
	public Student(IFinance financeDep) {
		this.financeDep = financeDep;
	}
	
	
	String getName(){ return "";}
	
	void payTuition(){
		if(financeDep != null)
			financeDep.payTuition(this);
	}
	void takeOOPExam(){ }
	void saveToDB(){ }

}
