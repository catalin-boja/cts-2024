package ro.ase.ie.cts.laboratory.design.patterns.singleton.eager;

public class Test {

	public static void main(String[] args) {
		
		//FileLog log1 = new FileLog();
		//FileLog log2 = new FileLog();
		
		FileLog log1 = FileLog.getLog();
		FileLog log2 = FileLog.getLog();
		
		if(log1 == log2) {
			System.out.println("Same object");
		}
		else {
			System.out.println("Different objects");
		}
	}

}
