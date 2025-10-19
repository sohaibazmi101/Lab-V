package Week_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> readyQueue = new LinkedList<>();
        System.out.print("Enter total number of processes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter process name " + (i + 1) + ": ");
            String processName = scanner.nextLine();
            readyQueue.add(processName);
        }
        System.out.println("\nReady Queue (FIFO order):");
        for (String process : readyQueue) {
            System.out.println(process);
        }
        System.out.println("\nSimulating process execution:");
        while (!readyQueue.isEmpty()) {
            String currentProcess = readyQueue.poll();
            System.out.println(currentProcess + " is being executed...");
        }
        System.out.println("\nAll processes completed.");
        scanner.close();
    }
}
