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
		
		FiveASideBeta.footballersAndStats();
		FiveASideBeta.calculation();
		FiveASideBeta.teamDistribution();

		
	
}
}