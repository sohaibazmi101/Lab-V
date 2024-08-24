package Week_2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,rem;
        System.out.print("Enter a Number : ");
        num = scanner.nextInt();
        scanner.close();
        System.out.print("Revese Number is : ");
        while(num !=0){
            rem = num % 10;
            num = num / 10;
            System.out.print(rem);
        }
        System.out.println();
    }
}
