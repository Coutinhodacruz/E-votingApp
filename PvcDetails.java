package votingApplication;

public class PvcDetails {

    private String firstName;
    private String lastName;
    private int age;
    private String state;
    private String city;
    private String streetName;
    private int streetNumber;
    private int cardNumber;
    private String pollingUnit;

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
        }
        else
        {
            System.out.println("Not eligible to vote.");
            System.exit(0);
        }
        return age;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }



    public void CardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        System.out.println();
        System.out.println("Card Validated!\n" + "Welcome to your polling unit!");
    }

}
