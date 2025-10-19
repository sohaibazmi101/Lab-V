package Week_2;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double busy_time, idle_time, cpu_utilization;
        System.out.print("Enter Busy Time of CPU: ");
        busy_time = scanner.nextDouble();
        System.out.print("Enter Idle Time of CPU: ");
        idle_time = scanner.nextDouble();
        scanner.close();
        double total_time = busy_time + idle_time;
        cpu_utilization = busy_time / total_time * 100;
        System.out.printf("CPU utilization: %.2f%%\n", cpu_utilization);
    }
}