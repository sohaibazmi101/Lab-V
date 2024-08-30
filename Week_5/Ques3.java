package Week_5;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lb, ub;
        System.out.print("Enter the lower bound of range : ");
        lb = scanner.nextInt();
        System.out.print("Enter the upper bound of range : ");
        ub = scanner.nextInt();
        for(int i = lb; i <= ub; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num){
        if(num <= 1){
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