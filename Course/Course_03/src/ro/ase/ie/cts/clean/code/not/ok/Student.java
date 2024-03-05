package ro.ase.ie.cts.clean.code.not.ok;

public class Student {
	
	FinanceDep financeDep;
	FinanceDepV2 financeDepNew;
	
	String getName(){ return "";}
	
	void payTuition(){
		financeDep.payTuition(this);
	}
	void takeOOPExam(){ }
	void saveToDB(){ }

}
