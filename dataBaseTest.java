package votingApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dataBaseTest {
     private dataBase voters;
        private Voters details;
        private eVoting methods;
        @BeforeEach
        void setUp(){
            voters = new dataBase();
            details = new Voters();
            methods = new eVoting();
        }

        @Test
        void testThatDataBaseIsEmpty(){
            int dataBase = votingApplication.dataBase.numberOfVoters();
            assertEquals(0, dataBase);
        }
        @Test
        void testThatVotersAre18YearsAndAbove(){
            int eligibleAge = details.getAge(18);
            assertEquals(18,eligibleAge );
        }
        @Test
        void testThatEligibleVotersCanVote(){
            String eligibleVotes = details.vote();
            assertEquals("Successfully voted!", eligibleVotes);
        }
        @Test
        void testThatDataBaseIncreasesPerVote(){
            String vote1 = details.vote();
            String vote2 = details.vote();
            String vote3 = details.vote();
            int dataBase = votingApplication.dataBase.numberOfVoters();
            assertEquals(3,dataBase);
        }

    }



