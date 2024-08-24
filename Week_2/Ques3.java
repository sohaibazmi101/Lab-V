package Week_2;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, rem;
        System.out.print("Enter a Number : ");
        num1 = scanner.nextInt();
        scanner.close();
        int num2 = num1/2;
        for(int i = 2; i<=num2; i++){
            rem = num1 % i;
            if(rem == 0){
                System.out.println(num1+" is Not Prime Number");
                break;
            }
            else if (rem != 0 && i == num2) {
                System.out.println(num1+" is a Prime Number");
            }
        }
    }
}
