package votingApplication;

import java.util.ArrayList;
import java.util.List;

public class dataBase {

    private static List<Voters> voters = new ArrayList<>();

    public static int numberOfVoters() {
        return voters.size();
    }

    public void addVotes(Voters eligibleVoterDetails) {
        voters.add(eligibleVoterDetails);
    }
}
