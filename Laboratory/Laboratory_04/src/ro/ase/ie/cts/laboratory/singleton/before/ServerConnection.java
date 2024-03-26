package ro.ase.ie.cts.laboratory.singleton.before;

public class ServerConnection {
	String serverIp;
	int serverPort;
	
	boolean isConnected = false;
	
	public ServerConnection(String serverIp, int serverPort) {
		this.serverIp = serverIp;
		this.serverPort = serverPort;
	}
	
	public ServerConnection() {
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
	
}
