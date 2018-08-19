import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Collections;


public class SixASideBeta {
public static int sum;
public static int numberOfTeams;
public static int sNOT;
	
	public static Scanner pd = new Scanner (System.in);
	public static LinkedHashMap <String, Integer> ps = new LinkedHashMap <String, Integer>();
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static ArrayList<HashMap<String, Integer>> la = new ArrayList<HashMap<String, Integer>>();
	
	
	
	
	public static void footballersAndStats() {
		
		for(int i = 0; i < menuTwo.players; i++) {
			System.out.println((i + 1) + " Enter player Name");
			String player = pd.next();
			
			System.out.println("Give " + player + " a rating out of 10");
			int rating = pd.nextInt();
			ps.put(player, rating);	
			la.add(ps);
			
			
			
		
			
		}
	}
	
	public static void calculation() {

		for(Integer stat : ps.values()) {
			sum += stat;
			
		}
		 numberOfTeams = menuTwo.players / 5;
		 sNOT = sum / numberOfTeams;
			
	}
	
public static void algorithm() {

		
		if(sum % numberOfTeams != 0) {
			al.add(0, sNOT);
		for(int i = 0; i < numberOfTeams - 1;  i++) {
			int remover = sum - sNOT;
			if(remover % (sNOT + 1) == 0) {
				al.add(i+1, sNOT + 1);
			}else {
			 al.add(i + 1, sNOT);
				
			}
			 
		 }
		
	}
		System.out.println(al);
		System.out.println("          ");
		System.out.println(sum + " sum");
		System.out.println(sNOT + " sNot");
		System.out.println(numberOfTeams + " numberOfTeams");
		System.out.println(menuTwo.players + " menuTwo.player");
		System.out.println("nested hashmap");
}

public static void teamDistribution() {
	
}

}


