import java.io.*;
import java.util.Scanner;

class CreditWriter {
    public static void main(String[] args) {
        // Get filename and create the file
        PrintWriter out = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        Boolean Repeat = true;
        String name = "";
        int age = 0, num = 0, amount = 0;
        System.out.print("Enter Filename-->");
        try {
            fileName = scan.nextLine(); 

            // create the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);  //PrintWriter allows you to write with println and print instead of .write
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }
        out.print("Name\tAge\t\tAmount Owed\n");
        do {
            
            System.out.println("Enter your name");
                name = scan.nextLine();
                out.print(name);
                out.print("\t");
            System.out.println("Enter your age");
                age = scan.nextInt();
                scan.nextLine();    //flushes scanner
                out.print(age);
                out.print("\t");    //tabulation character
            System.out.println("Enter your amount owed");
                amount = scan.nextInt();
                scan.nextLine();
                out.print(amount);
                out.print("\t\n");
            System.out.println("Enter 1 enter another person. Enter 0 to Quit");
                num = scan.nextInt();
                scan.nextLine();
                if (num == 1) {
                    Repeat = true;
                }
                else if (num == 0) {
                    Repeat = false;
                }
                else {
                    System.out.println("Syntax Error exiting program");
                    out.close();
                    System.exit(0); //exit program
                }
                
        } while(Repeat == true);
        out.close();
        // Write out the table.
        

    }
}