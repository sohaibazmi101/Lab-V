package Week_2;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_process_completed;
        double total_time;
        System.out.print("Enter total process completed: ");
        total_process_completed = scanner.nextInt();
        System.out.print("Enter total time taken(in seconds): ");
        total_time = scanner.nextDouble();
        scanner.close();
        double throughput = total_process_completed / total_time;
        System.out.printf("Throughput of the CPU: %.2f\n", throughput);
    }
}
