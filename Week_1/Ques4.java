package Week_1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        int op;
        boolean cond = true;
        while (cond) {
            System.out.print("Enter First numer : ");
            a = scanner.nextInt();
            System.out.print("Enter second numer : ");
            b = scanner.nextInt();
            System.out.println("1. for add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your Opeartion() : ");
            op = scanner.nextInt();
            if (op == 5) {
                cond = false;
            }
            else if (op == 1) {
                System.out.println("Sum = "+(a+b));
            }
            else if (op == 2) {
                System.out.println("Subtraction = "+(a-b));
            }
            else if (op == 3) {
                System.out.println("Multiplication = "+(a*b));
            }
            else if (op == 4) {
                System.out.println("Division = "+(a/b));
            }
            else 
            {
                System.out.println("Please Enter Correct Number!!");
            }
        }
        scanner.close();
    }
}
