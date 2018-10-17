import java.util.*;

public class SquareUser {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean goodData = false;

        while (!goodData) {
            System.out.print("Enter an integer: ");
            try {               //attempt to run code, if it doesnt run go to catch (if there is no integer entered the scanner throws exception)
                num = scan.nextInt();
                goodData = true;
            }

            catch (InputMismatchException ex) {         //if there is an inputmistmatch exception thrown by the scanner do the following
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
                String flush = scan.next(); 
            }
        }

        System.out.println("The square of " + num + " is " + num * num);

    }
}