package Week_2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b = 1;
        System.out.print("Enter a Number : ");
        a = scanner.nextInt();
        scanner.close();
        for(int i=2;i<=a;i++){
            b=b*i;
        }
        System.out.println("Factorial = " +b);
    }
}
