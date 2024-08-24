package Week_1;

import java.util.Scanner;

class Ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        System.out.println("Enter First Number : ");
        num1 = scanner.nextDouble();
        System.out.println("Enter Second Number : ");
        num2 = scanner.nextDouble();
        scanner.close();
        result = num1 + num2;
        System.out.println("SUM IS = "+result);
    }
}