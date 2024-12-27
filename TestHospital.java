import java.io.*;
import java.util.*;

public class TestHospital {
    public static void main(String[] args) throws IOException {
        // declare scanner and fileWriters
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter;

        do {
            // gather input
            System.out.print("Enter patient's ID: ");
            int pID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter patient's first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter patient's last name: ");
            String lastName = scanner.nextLine();
            System.out.println("");

            System.out.print("Enter doctor's first name: ");
            String docFirst = scanner.nextLine();

            System.out.print("Enter doctor's last name: ");
            String docLast = scanner.nextLine();

            System.out.print("Enter doctor's specialty: ");
            String specialty = scanner.nextLine();
            System.out.println("");

            System.out.print("Enter Admit Date (day/month/year): ");
            String admitDateStr = scanner.nextLine();
            Date admitDate = parseDate(admitDateStr);

            System.out.print("Enter Discharged Date (day/month/year): ");
            String dischargeDateStr = scanner.nextLine();
            Date dischargeDate = parseDate(dischargeDateStr);

            System.out.print("Enter pharmacy Charges, room Rent, and doctor Fee: ");
            double pharmCharg = scanner.nextDouble();
            double rmCharg = scanner.nextDouble();
            double dFee = scanner.nextDouble();

            // create instances of classes based on input
            Doctor doctor = new Doctor(docFirst, docLast, specialty);
            Patient patient = new Patient(pID, firstName, lastName, doctor, admitDate, dischargeDate);
            Bill bill = new Bill(pID, pharmCharg, rmCharg, dFee);

            // print info
            System.out.println("");
            System.out.println(patient.toString());
            System.out.println(bill.toString());

            // write to the file
            fileWriter = new FileWriter(firstName + lastName + ".txt");
            fileWriter.write(patient.toString());
            fileWriter.write(bill.toString());
            fileWriter.close();

            System.out.println("\nDo you want to continue? Enter 'y' for yes, 'n' for no");
        } while (scanner.next().equals("y"));
    }

    // method to parse date entered to send day month and year to date class
    private static Date parseDate(String dateStr) {
        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        return new Date(day, month, year);
    }
}
