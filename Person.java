import java.io.*;
import java.util.*;

public class Person {
    // define fields for person first & last name
    protected String firstName;
    protected String lastName;

    // constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // override toString for printing the name
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}