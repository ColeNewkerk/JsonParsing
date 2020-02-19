package domain;

import com.google.gson.annotations.SerializedName;

public class Person {

    String firstName;

    String lastName;

    int birthYear;



    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }


    @SerializedName("firstName")
    public String getFirstName() {
        return firstName;
    }

    @SerializedName("lastName")
    public String getLastName() {
        return lastName;
    }

    @SerializedName("birthYear")
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
