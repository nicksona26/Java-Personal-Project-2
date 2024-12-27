import java.util.*;

public class Ship implements Comparable<Ship> {
    // define fields for name and year
    private String name;
    private String year;

    // constructor
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    // accessor for name
    public String getName() {
        return name;
    }

    // modifier for name
    public void setName(String name) {
        this.name = name;
    }

    // accessor for year
    public String getYear() {
        return year;
    }

    // modifier for year
    public void setYear(String year) {
        this.year = year;
    }

    // override toString for printing
    @Override
    public String toString() {
        return "Name: " + name + "\nYear: " + year;
    }

    // override compareTo to compare based on name
    @Override
    public int compareTo(Ship ship) {
        return this.name.compareTo(ship.getName());
    }
}
