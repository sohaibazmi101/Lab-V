package Week_3;

import java.util.Scanner;
import java.lang.Math;;

public class Ques1 {
    public static void main(String[] args) {
        int num, i=0, rem, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        num = scanner.nextInt();
        int num1 = num;
        scanner.close();
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            if(rem > 1){
                System.out.println("Not a Biary Number!");
                break;
            }
            sum = sum + rem * pow(2, i);
        }
        System.out.println("Done");
    }
}
