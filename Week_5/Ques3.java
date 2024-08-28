package Week_5;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the range of numbers : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.print("Prime numbers Between " + num1 + " and " + num2 + " : ");
        scanner.close();
    }

    public static void printPrime(int num1,int num2){
        System.out.println(num1+num2);
    }
    public static boolean isPrime(int num){
        if(i <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}