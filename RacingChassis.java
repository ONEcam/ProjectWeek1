
public class RacingChassis extends ProfileBuilder {
	
	public RacingChassis(Profile newProfile) {
		super(newProfile);
		
		System.out.println("Races with mulitple chassis");
		
	}
	
	public String getRacingChassis() {
		return tempProfile.getRacingChassis() + ", Kosmic Kart";
	}

	@Override
	public String getNacionality() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
