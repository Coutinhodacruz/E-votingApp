package votingApplication;

public class Voters {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Not eligible to vote.");
        }
        return age;
    }

    public String vote() {
        Voters eligibleVoters = new Voters();
        dataBase voters = new dataBase();
        PvcDetails votersDetails = new PvcDetails();
        votersDetails.setFirstName("Coutinho");
        votersDetails.setLastName("Dacruz");
        votersDetails.getAge(25);
        Candidates preferredCandidate = Candidates.LP_PETER_OBI;
        voters.addVotes(eligibleVoters);
        return "Successfully voted!";
    }


}
