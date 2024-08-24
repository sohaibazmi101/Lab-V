package Week_3;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int rem;
        String emp_String = "";
        System.out.print("Enter a numbeer : ");
        num = scanner.nextInt();
        scanner.close();
        while(num != 0){
            rem = num % 2;
            num = num / 2;
            emp_String = rem + emp_String;
        }
        System.out.println("Binary Format = "+emp_String);
    }
}
