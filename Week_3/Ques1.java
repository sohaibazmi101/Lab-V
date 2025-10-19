package Week_3;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of process: ");
        int n = scanner.nextInt();
        double[] burst_time = new double[n];
        double total = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Enter burst time of process "+(i+1)+": ");
            burst_time[i] = scanner.nextDouble();
            total += burst_time[i];
        }
        scanner.close();
        System.out.printf("Total Burst time : %.2f\n", total);
        System.out.printf("Average burst time : %.2f\n", total / n);
    }
}
