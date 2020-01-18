import java.util.Scanner;

public class DriverProfileBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			
		@SuppressWarnings("resource")

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter your First Name:");
		String getFirstName = scan.nextLine();
				
		System.out.println("Enter your Last Name:");
		String getLastname = scan.nextLine();
				
		System.out.println("Enter your Nationality:");
		String getNacionality = scan.nextLine();

		System.out.println("Enter your Racing Class:");
		String getRacingClass = scan.nextLine();
				
		System.out.println("Enter your Racing Chassis:");
		String getRacingChassis = scan.nextLine();
				
		System.out.println("Enter your Racing Engine:");
		String getRacingEngine = scan.nextLine();
				
		System.out.println("Driver Profile");
			
		System.out.println(getFirstName);
		System.out.println(getLastname);
		System.out.println(getNacionality);
		System.out.println(getRacingClass);
		System.out.println(getRacingChassis);
		System.out.println(getRacingEngine);
					
		Profile profileBuilder = new RacingEngine(new RacingChassis(new RacingClass(new DriverProfile())));
		
		System.out.println("Driver Racing Classes: "  + getRacingClass + profileBuilder.getRacingClass());
		System.out.println("Driver Racing Chassis: "  + getRacingChassis + profileBuilder.getRacingChassis());
		System.out.println("Driver Racing Engines: "  + getRacingEngine + profileBuilder.getRacingEngine());		

	}

}
