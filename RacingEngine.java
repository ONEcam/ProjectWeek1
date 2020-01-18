public class RacingEngine extends ProfileBuilder {
	
	public RacingEngine(Profile newProfile) {
		super(newProfile);
		
		System.out.println("Races with mulitple engines");
		
	}
	
	public String getRacingEngine() {
		return tempProfile.getRacingEngine() + ", IAME";
	}

	@Override
	public String getNacionality() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
