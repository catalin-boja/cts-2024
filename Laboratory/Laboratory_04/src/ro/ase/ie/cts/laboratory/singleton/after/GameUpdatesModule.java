package ro.ase.ie.cts.laboratory.singleton.after;

public class GameUpdatesModule {
	

	public GameUpdatesModule() {
		super();
	}

	public void checkForUpdates() {
		
		ServerConnection conn = 
				 ServerConnection.getConnection();
		conn.connect();
		//...check for updates
	}
}
