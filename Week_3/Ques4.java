package Week_3;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, rem;
        int sum = 0;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        scanner.close();
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        System.out.println("Sum of Number = "+sum);
    }
}
