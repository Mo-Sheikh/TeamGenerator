import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ElevenASideBeta {
	public static int sum;
	public static int numberOfTeams;
	public static int sNOT;

	public static Scanner pd = new Scanner(System.in);
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static ArrayList<players> footballers = new ArrayList<players>();

	public static void footballersAndStats() {

		for (int i = 0; i < menuTwo.players; i++) {
			System.out.println((i + 1) + " Enter zplayer Name");
			String player = pd.next();

			System.out.println("Give " + player + " a rating zout of 10");
			int rating = pd.nextInt();
			footballers.add(i, new players(player, rating));

		}

	}

	public static void calculation() {

		numberOfTeams = menuTwo.players / 11;
		sNOT = sum / numberOfTeams;

	}

	public static void teamDistribution() {
		
	 String fairTeams[][] = new String [numberOfTeams][11];

		Collections.sort(footballers, Collections.reverseOrder());

	

		for (int i = 0; i < numberOfTeams; i++) {
			for (int k = 0; k < 11; k++) {
				fairTeams[i][k] = footballers.get(0).toString();
				footballers.remove(0);
				if (k < 10) {

					fairTeams[i][k + 1] = footballers.get((footballers.size()) - 1).toString();
					footballers.remove(footballers.size() - 1);
					k++;
				}

			}
			

		}
		for(int i = 0; i < numberOfTeams; i++) {
			System.out.println("Team " + (i + 1) + " " + Arrays.deepToString(fairTeams[i]));
		}
		

	}

}
