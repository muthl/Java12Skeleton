import java.io.*;
import java.util.Scanner;
class PowerTable {
    public static void main(String[] args) {
        // Get filename and create the file
        PrintWriter out = null; //identifier for PrintWriter
        Scanner scan = new Scanner(System.in);
        String fileName = "";
      
        System.out.print("Enter Filename-->");
        try {
            fileName = scan.next();

            // create the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);  //PrintWriter allows you to write with println and print instead of .write
        } catch (IOException iox) { //when throwing IOException iox do following code
            System.out.println("Error in creating file");
            return;
        }
        
        // Write out the table.
        int value = 1;
        out.println("Power\tValue");
        for (int pow = 0; pow <= 20; pow++) {
            out.print(pow);  //prints to file
            out.print('\t');    // puts a tabulation into the table
            out.println(value);
            value = value * 2;
        }
        out.close();

    }
}