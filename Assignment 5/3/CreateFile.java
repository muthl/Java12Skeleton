import java.io.*;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) {

        // Get filename and create the file
        BufferedWriter writer = null;   //creates the bufered writer variable writer
        FileWriter fileWriter = null;   //creates the FileWriter variable fileWriter
        
        Scanner scan = new Scanner(System.in); 
        String fileName = "";   //empty string
        System.out.print("Enter Filename-->");

        try {
            fileName = scan.next();
           
            fileWriter = new FileWriter(fileName);      
            writer = new BufferedWriter(fileWriter);    //FileWriter is run through BufferedWriter to make it faster
        } catch (IOException iox) { 
            System.out.println("Error in creating file");
            return;
        }

        // Write the file.
        try {
            writer.write(" \"You miss 100% of the shots\n");    //writes out the lines in the file
            writer.write("you dont take\n");
            writer.write("-Wayne Gretzgy \"\n");
            writer.write("- Michael Scott\n");
            writer.close();
        } catch (IOException iox) {
            System.out.println("Problem writing " + fileName);
        }
    }
}