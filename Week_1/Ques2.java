package Week_1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num = scanner.nextInt();
        scanner.close();
        int rem;
        rem = num%2;
        if(rem == 0){
            System.out.println("Number "+num+" is Even Number");
        }
        else{
            System.out.println("Number "+num+" is Odd Number");
        }
    }
}
