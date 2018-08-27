import java.util.Scanner;
public class menuTwo {
public static int players;
public static int menu;
private static Scanner selector = new Scanner(System.in);


public static void choice() {
	
	
	
	do {
	System.out.println("How many players do you have");
	players = selector.nextInt();
	
	
	
	System.out.println("Please choose from the menu");
	options.option();
	menu = selector.nextInt();
	

	if(players / (menu + 4) > 0.9 && players % (menu + 4) != 0) {
		System.out.println("ERROR - Not enough players for this game. Need");
	}
	if(players / (menu + 4) < 0.9 && players % (menu + 4) != 0) {
		System.out.println("Invalid choice - This game is not possible");
	}
	
	}while(players % (menu + 4) != 0);
	
	//System.out.print("\033[H\033[2J");

}
public static void chosen() {
	

	switch(menu) {
	
	case 1: 
		
		FiveASideBeta.footballersAndStats();
		FiveASideBeta.calculation();
		FiveASideBeta.teamDistribution();

		
		
	break;
	
	case 2:
		SixASideBeta.footballersAndStats();
		SixASideBeta.calculation();
		SixASideBeta.teamDistribution();
	
	break;
	
	case 3:
		SevenASideBeta.footballersAndStats();
		SevenASideBeta.calculation();
		SevenASideBeta.teamDistribution();
	
	break;
	
	case 4:
		EightASideBeta.footballersAndStats();
		EightASideBeta.calculation();
		EightASideBeta.teamDistribution();
	
	break;
		
	case 5:
		NineASideBeta.footballersAndStats();
		NineASideBeta.calculation();
		NineASideBeta.teamDistribution();
		
	break;
	
	case 6:
		TenASideBeta.footballersAndStats();
		TenASideBeta.calculation();
		TenASideBeta.teamDistribution();
	
	break;
	
	case 7:
		ElevenASideBeta.footballersAndStats();
		ElevenASideBeta.calculation();
		ElevenASideBeta.teamDistribution();
		
	break;
	}
}
}