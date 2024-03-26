package ro.ase.ie.cts.laboratory.singleton.after;

public class ServerConnection {
	String serverIp;
	int serverPort;
	boolean isConnected = false;
	
	private static ServerConnection connection;
	
	private ServerConnection(String serverIp, int serverPort) {
		this.serverIp = serverIp;
		this.serverPort = serverPort;
	}
	
	private ServerConnection() {
		this.serverIp="127.0.0.1";
		this.serverPort = 9090;
	}
	
	public void connect() {
		if(!this.isConnected) {
		System.out.println(
				String.format("Connecting to %s:%d",
						this.serverIp,
						this.serverPort));
		}
	}
	
	public void disconnect() {
		this.isConnected = false;
	}
	
	public static ServerConnection getConnection() {
		if(connection == null) {
			connection = new ServerConnection("10.0.0.1",5050);
		}
		return connection;
	}
	
}
