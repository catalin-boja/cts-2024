package ro.ase.ie.cts.clean.code;

public class Test {

	public static void main(String[] args) {
		
		//app startup
		DependencyContainer container = 
				new DependencyContainer();
		container.addDependency(new FinanceDep());
		container.addDependency(new FinanceDepNew());
		
		
		
		Student student2020 = 
				new Student(new FinanceDep());
		student2020.payTuition();
		
		Student student2023 = 
				new Student(new FinanceDepNew());
		student2023.payTuition();
		
		student2020.setFinanceDep(new FinanceDepNew());
		student2020.payTuition();
		
	}

}
