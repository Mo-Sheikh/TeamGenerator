import java.util.HashMap;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.util.Collections;
import java.util.Arrays;
public class FiveASide {
	public static int g = 0;
	
	
	
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
		
		int numberOfTeams = menu.players / 5;
		
		String[][] teamas  = new String [numberOfTeams][5];
		
		Collections.shuffle(squad);
		int i = 0;

			for(int j = 0; j < numberOfTeams; j++) {
				for(int k = 0; k < 5; k++) {
					teamas[j][k] = squad.get(i++);
				

			

			
		
		}
		
		}
		
		
		System.out.println(Arrays.deepToString(teamas));
		//System.out.print(teamas);
				
//				{"a", "a", "a", "a", "a"}
//				{"a", "a", "a", "a", "a"};
			
	}
	
}
