import java.util.Scanner;
public class qualifier {
	public static String AdvancedChoice;
	
	public static Scanner advanChoice = new Scanner(System.in);
	
	public static void advanced() {
		
		System.out.println("Do you want to use the advanced version of this application");
	
		AdvancedChoice = advanChoice.nextLine();
		
		if(AdvancedChoice.toLowerCase().startsWith("y") || AdvancedChoice.startsWith("o")) {
			menuTwo.choice();
			menuTwo.chosen();
			
		
		}
		else {
			menu.choice();
			menu.chosen();
		}
			
		
			
		}
		
	}

