package ro.ase.ie.cts.laboratory.singleton.after;

public class UserProfileModule {


	public UserProfileModule() {
		super();
	}

	
	public void getProfileData() {
		
		
		ServerConnection connection = 
				ServerConnection.getConnection();
		connection.connect();
		//...get user profile
	}
}
