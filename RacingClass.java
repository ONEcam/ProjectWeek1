
public class RacingClass extends ProfileBuilder {
	
	public RacingClass(Profile newProfile) {
		super(newProfile);
		
		System.out.println("Races in mulitple classes");
		
	}
	
	public String getRacingClass() {
		return tempProfile.getRacingClass() + " , Micro";
	}

	@Override
	public String getNacionality() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
