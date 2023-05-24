import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        try{
            return a / b;
        }
        catch (Exception ex){
            System.out.println("Invalid operation");
            return 0;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Enter the first number :");
            int a = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int b = scanner.nextInt();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Zero for exit");
            System.out.println("Please enter the number of the operation : ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println(Addition(a, b));
                    break;
                case 2:
                    System.out.println(Subtraction(a, b));
                    break;
                case 3:
                    System.out.println(Multiplication(a, b));
                    break;
                case 4:
                    System.out.println(Division(a, b));
                    break;
                case 0:
                    System.out.println("Thank you");
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
        }
    }
}