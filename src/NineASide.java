import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;
import java.util.Arrays;
public class NineASide {
	private static final int GAME = 9;
	
	
	
	public static Scanner selector = new Scanner(System.in);
	public static ArrayList <String> squad = new ArrayList<String>();
	
	
	
	public static void footballers() {
		 
	
		for(int i = 0; i < menu.players; i++) {
			System.out.println("enter player " + (i + 1)) ;
			 String player = selector.nextLine();
			 squad.add(i, player);
				
		}
	//	System.out.println(squad);
	}
	
	public static void teams() {
		
		int numberOfTeams = menu.players / 9;
		
		String[][] teamas  = new String [numberOfTeams][9];
		
		Collections.shuffle(squad);
		int i = 0;

			for(int j = 0; j < numberOfTeams; j++) {
				for(int k = 0; k < 9; k++) {
					teamas[j][k] = squad.get(i++);
				

			

			
		
		}
		
		}
		
		
		System.out.println(Arrays.deepToString(teamas));
		//System.out.print(teamas);
				
//				{"a", "a", "a", "a", "a"}
//				{"a", "a", "a", "a", "a"};
			
	}
	
}
