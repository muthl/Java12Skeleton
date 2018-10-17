import java.io.*;

class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "Tester"; //calls on file called Tester
        String line;

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));   //uses BufferedReader to speed up FileReader
            line = in.readLine();   //line is the variable assigned to reading a line in the file
            while (line != null) // continue until end of file
            {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) {
            System.out.println("Problem reading " + fileName);
        }
    }
}