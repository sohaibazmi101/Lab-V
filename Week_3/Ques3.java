package Week_3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of processes: ");
        int n = scanner.nextInt();
        double[] AT = new double[n]; 
        String[] PID = new String[n];
        for (int i = 0; i < n; i++) {
            PID[i] = "P" + (i + 1);
            System.out.print("Enter arrival time of " + PID[i] + ": ");
            AT[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (AT[j] > AT[j + 1]) {
                    // swap arrival times
                    double tempAT = AT[j];
                    AT[j] = AT[j + 1];
                    AT[j + 1] = tempAT;
                    String tempPID = PID[j];
                    PID[j] = PID[j + 1];
                    PID[j + 1] = tempPID;
                }
            }
        }
        System.out.println("\nProcesses sorted by Arrival Time:");
        System.out.println("---------------------------------");
        System.out.println("Process\tArrival Time");
        for (int i = 0; i < n; i++) {
            System.out.println(PID[i] + "\t" + AT[i]);
        }
        scanner.close();
    }
}
