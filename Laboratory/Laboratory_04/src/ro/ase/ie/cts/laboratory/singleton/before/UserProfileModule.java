package ro.ase.ie.cts.laboratory.singleton.before;

public class UserProfileModule {

	ServerConnection connection;
	
	public UserProfileModule(ServerConnection connection) {
		super();
		this.connection = connection;
	}

	
	public void getProfileData() {
//		ServerConnection conn = 
//				new ServerConnection("10.0.0.1",5050);
		this.connection.connect();
		//...get user profile
	}
}
