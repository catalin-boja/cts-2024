package ro.ase.ie.cts.laboratory.singleton.before;

public class TestGame {

	public static void main(String[] args) {
		
		
		ServerConnection uniqueConnection = 
				new ServerConnection("10.0.0.1",5050);
		
		GameUpdatesModule updates = 
				new GameUpdatesModule(uniqueConnection);
		updates.checkForUpdates();
		
		UserProfileModule profile = 
				new UserProfileModule(uniqueConnection);
		profile.getProfileData();
		
	}

}
