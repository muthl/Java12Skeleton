import java.util.Scanner;
public class CatchAll {
    public static void main(String[] args) {
        int num = 0;
        int div = 0;
        Scanner scan = new Scanner(System.in);
        try {       //attempt to do the code, if failed, go to catch
            System.out.print("Enter the numerator: ");
            num = scan.nextInt();
            System.out.print("Enter the divisor  : ");
            div = scan.nextInt();
            System.out.println(num + " / " + div + " is " + (num / div) + " rem " + (num % div));
        } catch (ArithmeticException ex) {  //if there is an arithmetic exception do this following code
            System.out.println("You can't divide " + num + " by " + div);
        } catch (Exception ex) {            //for any other exception do the following code
            System.out.println("Something went wrong.");    
        }

        System.out.println("Good-bye");
    }
}