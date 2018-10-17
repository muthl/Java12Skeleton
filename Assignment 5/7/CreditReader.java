import java.io.*;

class CreditReader {
    public static void main(String[] args) {
        String fileName = "Test";   //specifies file Test
        String line;

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine();
            while (line != null) // continue until end of file
            {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) { //if this exception is thrown do following
            System.out.println("Problem reading " + fileName);
        }
    }
}