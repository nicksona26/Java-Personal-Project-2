import java.io.*;
import java.util.*;

public class Date {
    // define fields for month, year, and day
    private int month;
    private int year;
    private int day;

    // constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // override toString for printing
    @Override
    public String toString() {
        return month + "-" + day + "-" + year;
    }
}
