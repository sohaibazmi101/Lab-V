package Week_5;

import java.util.Scanner;

public class Ques1 {
    public static class Process {
        String pid;
        double arrival_time;
        double burst_time;
        double completion_time;
        double turnaround_time;
        double waiting_time;

        public Process(String pid, double arrival_time, double burst_time) {
            this.pid = pid;
            this.arrival_time = arrival_time;
            this.burst_time = burst_time;
        }
    }

    public static Process[] inputProcesses(int n) {
        Scanner scanner = new Scanner(System.in);
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of process " + (i + 1) + ": ");
            System.out.print("Process ID: ");
            String pid = scanner.nextLine();
            System.out.print("Arrival Time: ");
            double arrival_time = scanner.nextDouble();
            System.out.print("Burst Time: ");
            double burst_time = scanner.nextDouble();
            scanner.nextLine();
            processes[i] = new Process(pid, arrival_time, burst_time);
        }
        scanner.close();
        return processes;
    }
    public static void calculateCompletionTime(Process[] processes){
        double current_time = 0;
        for(Process p : processes){
            if(current_time < p.arrival_time){
                current_time = p.arrival_time;
            }
            current_time += p.burst_time;
            p.completion_time = current_time;
        }
    }
    public static void calculateWTandTAT(Process[] processes){
        for(Process p : processes){
            p.turnaround_time = p.completion_time - p.arrival_time;
            p.waiting_time = p.turnaround_time - p.burst_time;
        }
    }
    public static void displayProcesses(Process[] processes){
        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");
        for(Process p : processes){
            System.out.println(p.pid+"\t"+p.arrival_time+"\t"+p.burst_time+"\t"+p.completion_time+"\t"+p.turnaround_time+"\t"+p.waiting_time);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of process: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Process[] processes = inputProcesses(n);
        calculateCompletionTime(processes);
        calculateWTandTAT(processes);
        displayProcesses(processes);
        scanner.close();
    }
}