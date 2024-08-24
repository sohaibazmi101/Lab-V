package Week_1;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter first Number : ");
        num1 = scanner.nextInt();
        System.out.print("Enter second Number : ");
        num2 = scanner.nextInt();
        System.out.print("Enter third Number : ");
        num3 = scanner.nextInt();
        scanner.close();
        if(num1==num2&& num2==num3){
            System.out.println("All numbers are EQUAL!");
        }
        else if(num1>num2 && num1 > num3){
            System.out.println("Number "+num1+" is Greatest");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("Number "+num2+" is Greatest");
        }
        else {
            System.out.println("Number "+num3+" is Greatest");
        }
    }
}
