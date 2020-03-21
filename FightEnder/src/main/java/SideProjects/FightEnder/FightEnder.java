package SideProjects.FightEnder;

import java.util.Scanner;

public class FightEnder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numOfContestants;

		System.out.print("How many contestants? ");
		numOfContestants = Integer.parseInt(input.nextLine());

		String[] name = new String[numOfContestants];
		int[] guess = new int[numOfContestants];

		int total = numOfContestants * 50;
		double random = (Math.random() * (total - 2) + 1);
		int chosen = (int) random;

		int winner = 0;
		int diff = numOfContestants * 50;
		int intDiff = 0;

		for (int i = 0; i < numOfContestants; i++) {
			System.out.print("Enter contestant name: ");
			name[i] = input.nextLine();
			System.out.print("Enter guess between 1 and " + total + " :");
			guess[i] = Integer.parseInt(input.nextLine());

			if (guess[i] > chosen) {
				intDiff = guess[i] - chosen;

			} else if (guess[i] < chosen) {
				intDiff = chosen - guess[i];
			}
			if (intDiff < diff) {
				diff = intDiff;
				winner = i;
			}

		}

		
		for (int i = 0; i < numOfContestants; i++) {
			System.out.println(name[i] + " guessed " + guess[i] );
		}
		System.out.println("The magic number is " + chosen);
		System.out.println("The winner is " + name[winner] + " with a difference of " + diff);
		
		input.close();
	}
	

}
