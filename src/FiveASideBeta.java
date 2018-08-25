import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Collections;


public class FiveASideBeta implements Comparable{
public static int sum;
public static int numberOfTeams;
public static int sNOT;
static int totes;
static String [] fairTeams;
	
	public static Scanner pd = new Scanner (System.in);
	public static LinkedHashMap <String, Integer> ps = new LinkedHashMap <String, Integer>();
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static ArrayList<Object> footballers = new ArrayList<Object>();
	
	
	
	public static void footballersAndStats() {
		
		for(int i = 0; i < menuTwo.players; i++) {
			System.out.println((i + 1) + " Enter zplayer Name");
			String player = pd.next();
			
			System.out.println("Give " + player + " a rating zout of 10");
			int rating = pd.nextInt();
			footballers.add(i, new players (player, rating));
			ps.put(player, rating);	

			
		}
	
	}
//
//	public static void calculation() {
//		System.out.println("test a");
//
//		for(Integer stat : ps.values()) {
//			sum += stat;
//			
//		}
//		 numberOfTeams = menuTwo.players / 5;
//		 sNOT = sum / numberOfTeams;
//			
//	}
	
							//* Algorithm is redundant
//public static void algorithm() {
//
//	System.out.println("test b");
//		
//		if(sum % numberOfTeams != 0) {
//			al.add(0, sNOT);
//		for(int i = 0; i < numberOfTeams - 1;  i++) {
//			int remover = sum - sNOT;
//			if(remover % (sNOT + 1) == 0) {
//				al.add(i+1, sNOT + 1);
//			}else {
//			 al.add(i + 1, sNOT);
//				
//			}
//			 
//		 }
//	}
//}
		
	public static void teamDistribution() {
		
		Arrays.sort(footballers, );

	}
	
	public static void proStats() {
		System.out.println("test d");
		System.out.println("total quality " + sum);
		System.out.println();
		System.out.println("Split stats " + al);
		System.out.println();
		System.out.println("first squad  " + fairTeams.toString());
		System.out.println();
		System.out.println("first squad  " + Arrays.deepToString(fairTeams));
		System.out.println();
		System.out.println("first team stats  " + totes);


		
	}
}
			
			

		
	
			
		
		
		
		
		
		

//for(int l = 0; l < numberOfTeams; l++) {
//System.out.println("Teams " + l + "  "+ Arrays.deepToString(fairTeams[l]));
//	System.out.println(footballers.toString());
//System.out.println(Arrays.deepToString(fairTeams));
//System.out.println(al);
//System.out.println("          ");
//System.out.println(sum + " sum");
//System.out.println(sNOT + " sNot");
//System.out.println(numberOfTeams + " numberOfTeams");
//System.out.println(menuTwo.players + " menuTwo.player");