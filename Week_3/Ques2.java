package Week_3;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of process: ");
        int n = scanner.nextInt();
        double[] burst_time = new double[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter burst time of process P"+(i+1)+": ");
            burst_time[i] = scanner.nextDouble();
        }
        double least_burst_time = burst_time[0];
        int index = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Burst Time of Process P"+(i+1)+" = "+burst_time[i]);
            if(least_burst_time > burst_time[i]){
                least_burst_time = burst_time[i];
                index = i+1;
            }
        }
        System.out.println("Least Burst if process P"+index+": "+least_burst_time);
    }
}
