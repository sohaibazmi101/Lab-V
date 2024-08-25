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
        int avg;
        avg = sum / (a.length - 1);
        System.out.println("Average of Array = "+avg);
        int max, min;
        max = a[0];
        min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Maximum Value = "+max);
        System.out.println("Minimum Value ="+min);
    }
}
