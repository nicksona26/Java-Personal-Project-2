import java.io.*;
import java.util.*;

public class Doctor extends Person {
    // define field for specialty
    private String specialty;

    // constructor
    public Doctor(String firstName, String lastName, String specialty) {
        super(firstName, lastName);
        this.specialty = specialty;
    }

    // method to return the doctors specialty
    public String getSpecialty() {
        return specialty;
    }

    // override toString method for printing
    @Override
    public String toString() {
        return super.toString() + ", " + specialty;
    }
}
