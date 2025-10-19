package Week_1;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int context_switch_time, total_process, total_overhead;
        System.out.print("Enter the total number of process: ");
        total_process = scanner.nextInt();
        System.out.print("Enter the Contex Switch Time: ");
        context_switch_time = scanner.nextInt();
        scanner.close();
        total_overhead = (total_process - 1) * context_switch_time;
        System.out.println("Total Overhead: "+total_overhead);
    }
}
