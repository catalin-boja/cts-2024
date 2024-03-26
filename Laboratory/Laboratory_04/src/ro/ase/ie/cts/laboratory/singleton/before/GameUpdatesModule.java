package ro.ase.ie.cts.laboratory.singleton.before;

public class GameUpdatesModule {
	
	ServerConnection connection;
	
	public GameUpdatesModule(ServerConnection connection) {
		super();
		this.connection = connection;
	}

	public void checkForUpdates() {
		
		if(connection != null) {
			this.connection.connect();
		}
//		ServerConnection conn = 
//				new ServerConnection("10.0.0.1",5050);
//		conn.connect();
		//...check for updates
	}
}
