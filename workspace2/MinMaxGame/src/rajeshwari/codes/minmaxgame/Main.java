package rajeshwari.codes.minmaxgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] var) {
		List<Integer> reList= generateList();
		int playerSum1 = 0;
		int playerSum2 = 0;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		boolean isPlayerOnePlaying = true;
		while (!reList.isEmpty()) {
			System.out.println(reList);
			System.out.println("Players 1 sum " + playerSum1);
			System.out.println("Players 2 sum " + playerSum2);
			if (isPlayerOnePlaying) {
				System.out.println("Which number you'd like to take, right or left?: ");
				String s = reader.next();
				if (s.equals("right")) {
					int lastIndex = reList.size() - 1;
					int removednumber= reList.remove(lastIndex);
					playerSum1+= removednumber;
				} else {
					int firstIndex = 0;
					int removednumber= reList.remove(firstIndex);
					playerSum1+= removednumber;
				}
			} else {
				System.out.println("Which number you'd like to take, right or left?: ");
				String s = reader.next();
				if (s.equals("right")) {
					int lastIndex = reList.size() - 1;
					int removednumber= reList.remove(lastIndex);
					playerSum2+= removednumber;
				} else {
					int firstIndex = 0;
					int removednumber= reList.remove(firstIndex);
					playerSum2+= removednumber;
				}
			}
			isPlayerOnePlaying = !isPlayerOnePlaying;
		}

		if(playerSum1>playerSum2){
			System.out.println("Player 1 wins!");
		} else if (playerSum1<playerSum2) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Tie!");
		}
		reader.close();
	}

	private static List<Integer> generateList() {
		List<Integer> rnList=new ArrayList<>();
		Random rn= new Random();
		for(int i=0; i<10;i++){
			int r = rn.nextInt() % 100;
			rnList.add(r);
		}
		return rnList;
	}
}
