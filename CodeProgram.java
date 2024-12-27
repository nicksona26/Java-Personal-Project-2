import java.io.*;
import java.util.*;

public class CodeProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cipher program.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Gather input for cipher type
            System.out.println("Type 1 for Substitution Cipher.");
            System.out.println("Type 2 for Shuffle Cipher.");
            int choice = scanner.nextInt();
            Cipher cipher;

            // gather shift or shuffle amount based on cipher choice and create objects of corresponding cipher type
            if (choice == 1) {
                System.out.println("What is the key (shift amount) for your code?");
                int shift = scanner.nextInt();
                cipher = new SubstitutionCipher(shift);
                System.out.println(cipher.cipherType() + "-shift amount = " + shift);
            } else if (choice == 2) {
                System.out.println("What is the key (shuffle amount) for your code?");
                int n = scanner.nextInt();
                cipher = new ShuffleCipher(n);
                System.out.println(cipher.cipherType() + "-shuffle amount = " + n);
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Gather user input for input & output filename and encode or decode
            System.out.println("Enter input file name:");
            String inputFileName = scanner.next();

            System.out.println("Enter output file name:");
            String outputFileName = scanner.next();

            System.out.println("Encode (E) or Decode (D)");
            String operation = scanner.next();

            String txt = readFromFile(inputFileName);
            String result;


            // cast cipher to corresponding interface to make use of methods encode or decode
            if (operation.equals("E")) {
                result = ((MessageEncoder) cipher).encode(txt);
            } else if (operation.equals("D")) {
                result = ((MessageDecoder) cipher).decode(txt);
            } else {
                System.out.println("Invalid operation. Please try again.");
                continue;
            }

            // call the writeToFile method by passing the file name and the text to write
            writeToFile(outputFileName, result);

            if (operation.equals("E")) {
                System.out.println("Encoded text saved in " + outputFileName);
            } else if (operation.equals("D")) {
                System.out.println("Decoded text saved in " + outputFileName);
            }

            // ask user if they want to do another message
            System.out.println("Do you want to do another message (Y/N)?");
            String cont = scanner.next();
            if (cont.equals("N")) {
                break;
            }
        }
        scanner.close();
    }

    // method to read text from file
    private static String readFromFile(String fileName) {
        StringBuilder txtFromFile = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                txtFromFile.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return txtFromFile.toString();
    }


    // method to write text to file
    private static void writeToFile(String fileName, String text) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println("IOException has occured");
        }
    }
}
