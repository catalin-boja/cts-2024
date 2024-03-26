package ro.ase.ie.cts.laboratory.design.patterns.singleton.register;


//IS NOT OK
//IS CONFUSING and DOES NOT WORK
public class FileLog {

	String filename;
	
	//lazy instantiation
	private static FileLog log;
	
	private FileLog() {
		
	}
		
	private FileLog(String filename) {
		super();
		this.filename = filename;
	}
	
	
	public String getFilename() {
		return filename;
	}

	public static synchronized FileLog getLog(String filename) {
		if(log == null) {
			log = new FileLog(filename);
		}
		return log;
	}
}
