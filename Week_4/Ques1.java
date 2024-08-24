package Week_4;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter size of Array : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for(int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for(int i = 0; i < a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of Array = "+sum);
        int temp;
        for(int i = 0; i < a.length; i++){
            temp = a[i];
            
        }
    }
}
