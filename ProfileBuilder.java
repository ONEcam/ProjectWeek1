public abstract class ProfileBuilder implements Profile{

	protected Profile tempProfile;
	
	public ProfileBuilder(Profile newProfile){
		
		tempProfile = newProfile;
	}
	
	public String getFirstName(){
		return tempProfile.getFirstName();
	}
	
	public String getLastname(){
		return tempProfile.getLastname();
	}
	
	public String getNationality(){
		return tempProfile.getNacionality();
	}
	
	public String getRacingClass(){
		return tempProfile.getRacingClass();
	}
	
	public String getRacingChassis(){
		return tempProfile.getRacingChassis();
	}
	
	public String getRacingEngine(){
		return tempProfile.getRacingEngine();
	}
	

}
