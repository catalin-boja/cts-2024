package ro.ase.ie.cts.laboratory.design.patterns.singleton.eager;

public class FileLog {

	String filename;
	
	//eager instantiation
	private static FileLog log = new FileLog("log.txt");
	
	//version 2
	//public final static FileLog log = new FileLog("log.txt");
	
	private FileLog() {
		
	}
		
	private FileLog(String filename) {
		super();
		this.filename = filename;
	}

	
	//version 2 you can remove the method
	public static synchronized FileLog getLog() {
		return log;
	}
}
