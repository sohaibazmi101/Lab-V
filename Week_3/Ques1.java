package Week_3;

import java.util.Scanner;
import java.lang.Math;;

public class Ques1 {
    public static void main(String[] args) {
        int num, i=0, rem, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        num = scanner.nextInt();
        scanner.close();
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            if(rem > 1){
                System.out.println("Not a Binary Number!");
                break;
            }
            sum = (int) (sum + rem * Math.pow(2, i));
            i++;
        }
        System.out.println("Decimal Number is : "+sum);
    }
}
