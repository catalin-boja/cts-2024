package ro.ase.ie.cts.laboratory.design.patterns.singleton.register;

import java.util.HashMap;

//name it FileLog
public class FileLogRegistry {
	
	String filename;
	
	private static HashMap<String, FileLogRegistry> logs = 
			new HashMap();

	private FileLogRegistry(String filename) {
		this.filename = filename;
	}
	
	public String getFilename() {
		return filename;
	}

	public static FileLogRegistry getFileLog(String filename) {
		FileLogRegistry log = 
				logs.get(filename);
		if(log == null) {
			log = new FileLogRegistry(filename);
			logs.put(filename, log);
		}
		return log;
	}
	
	
}
