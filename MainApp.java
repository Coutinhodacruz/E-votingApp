package votingApplication;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        eVoting eVoting = new eVoting();



        String input;
        do{
            eVoting.votingDetails();
            eVoting.voting();
            System.out.println("\nAny other voter?");
            input = scanner.next();
        } while (input.equalsIgnoreCase("Yes"));
        System.out.println();
        System.out.println(dataBase.numberOfVoters() + " people voted in this election.");
        eVoting.countVotes();

    }
}
