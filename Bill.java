import java.io.*;
import java.util.*;

public class Bill {
    // define fields for patient ID, pharmacy charges, room charges, and doctors Fee
    private int pID;
    private double pharmCharg;
    private double rmCharg;
    private double dFee;

    // constructor
    public Bill(int pID, double pharmCharg, double rmCharg, double dFee) {
        this.pID = pID;
        this.pharmCharg = pharmCharg;
        this.rmCharg = rmCharg;
        this.dFee = dFee;
    }

    // method to calculate total
    public double getTotal() {
        return pharmCharg + rmCharg + dFee;
    }

    // override toString method for printing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pharmacy Charges: $").append(pharmCharg).append("\n");
        sb.append("Room Charges: $").append(rmCharg).append("\n");
        sb.append("Doctor's Fee: $").append(dFee).append("\n");
        sb.append("_____________________________\n");
        sb.append("Total Charges: $").append(getTotal()).append("\n");
        return sb.toString();
    }
}
