import java.util.Scanner;
public class menu {
public static int players;
public static int menu;
private static Scanner selector = new Scanner(System.in);


public static void choice() {
	
	System.out.println("How many players do you have");
	players = selector.nextInt();
	
	
	
	System.out.println("Please choose from the menu");
	options.option();
	menu = selector.nextInt();
}

public static void chosen() {
	

	switch(menu) {
	
	case 1: 
		FiveASide.footballers();
		FiveASide.teams();
	break;
	
	case 2:
		SixASide.footballers();
		SixASide.teams();
	break;
	
	case 3:
		SevenASide.footballers();
		SevenASide.teams();
	break;
	
	case 4:
		EightASide.footballers();
		EightASide.teams();
	break;
		
	case 5:
		NineASide.footballers();
		NineASide.teams();
	break;
	
	case 6:
		TenASide.footballers();
		TenASide.teams();
	break;
	
	case 7:
		ElevenASide.footballers();
		ElevenASide.teams();
	break;
	}
}
}

