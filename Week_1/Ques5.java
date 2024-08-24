package Week_1;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter year : ");
        year = scanner.nextInt();
        if(year%4 == 0){
            System.out.println(year+" is a Leap year");
        }else{
            System.out.println(year+" is Not a Leap year");
        }
        scanner.close();
    }
}
