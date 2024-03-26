package ro.ase.ie.cts.laboratory.design.patterns.singleton.register;

public class Test {

	public static void main(String[] args) {
		
		//not ok
		FileLog errorsLog = FileLog.getLog("errors.txt");
		
		//later or in other module
		
		FileLog infoLog = FileLog.getLog("info.txt");
		
		System.out.println(errorsLog.getFilename());
		System.out.println(infoLog.getFilename());
		
		//test the registry
		FileLogRegistry errLogs = 
				FileLogRegistry.getFileLog("errors.txt");
		FileLogRegistry infoLogs = 
				FileLogRegistry.getFileLog("info.txt");
		
		System.out.println(errLogs.getFilename());
		System.out.println(infoLogs.getFilename());
		
		
	}

}
