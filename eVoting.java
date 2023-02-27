package votingApplication;

import java.util.Scanner;

public class eVoting {

    private int peterObi = 0;
    private int atikuAbubakar = 0;
    private int bolaTinubu = 0;
    private int omoyeleSowore = 0;
    private int rabiuKwankwaso = 0;

    public int getPeterObi() {
        return peterObi;
    }

    public int getAtikuAbubakar() {
        return atikuAbubakar;
    }

    public int getBolaTinubu() {
        return bolaTinubu;
    }

    public int getOmoyeleSowore() {
        return omoyeleSowore;
    }

    public int getRabiuKwankwaso() {
        return rabiuKwankwaso;
    }

    Scanner scanner = new Scanner(System.in);

    Voters eligibleVoters = new Voters();
    dataBase voters = new dataBase();
    PvcDetails votersDetails = new PvcDetails();

    public void votingDetails() {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        votersDetails.setFirstName(firstName);
        System.out.print("Please enter your last name: ");
        String lastName = scanner.next();
        votersDetails.setLastName(lastName);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        votersDetails.getAge(age);
        System.out.print("Enter your 8-digit PVC number: ");
        int cardNumber = scanner.nextInt();
        votersDetails.CardNumber(cardNumber);
    }

    public void voting() {
        System.out.println("\nPlease enter the corresponding number to vote any of the candidates below;");
        System.out.println("""
                1. PETER OBI - Labour Party(LP)
                2. ATIKU ABUBAKAR - Peoples Democratic Party(PDP)
                3. BOLA TINUBU - All Progressives Congress (APC)
                4. OMOYELE SOWORE - African Action Congress(AAC)
                5. RABIU KWANKWASO - New Nigeria Peoples Party(NNPP)
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            Candidates preferredCandidate = Candidates.LP_PETER_OBI;
            peterObi++;
            System.out.println("Thank you for your vote!");
            eligibleVoters.vote();
        } else if (choice == 2) {
            Candidates preferredCandidate = Candidates.PDP_ATIKU_ABUBAKAR;
            atikuAbubakar++;
            System.out.println("Thank you for your vote!");
            eligibleVoters.vote();
        } else if (choice == 3) {
            Candidates preferredCandidate = Candidates.APC_BOLA_TINUBU;
            bolaTinubu++;
            System.out.println("Thank you for your vote!");
            eligibleVoters.vote();
        } else if (choice == 4) {
            Candidates preferredCandidate = Candidates.AAC_OMOYELE_SOWORE;
            omoyeleSowore++;
            System.out.println("Thank you for your vote!");
            eligibleVoters.vote();
        } else if (choice == 5) {
            Candidates preferredCandidate = Candidates.NNPP_RABIU_KWANKWASO;
            rabiuKwankwaso++;
            System.out.println("Thank you for your vote!");
            eligibleVoters.vote();
        }
    }

    public void countVotes() {
        System.out.println("\nPeter Obi got " + getPeterObi() + " votes.");
        System.out.println("Atiku Abubakar got " + getAtikuAbubakar() + " votes.");
        System.out.println("Bola Tinubu got " + getBolaTinubu() + " votes.");
        System.out.println("Omoyele Sowore got " + getOmoyeleSowore() + " votes.");
        System.out.println("Rabiu Kwankwaso got " + getRabiuKwankwaso() + " votes.");
        System.out.println();
    }

}
