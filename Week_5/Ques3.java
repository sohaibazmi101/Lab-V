package Week_5;

import java.util.Scanner;

public class Ques3 {
    public static double[] responseRatio(Ques1.Process[] processes){
        int n = processes.length;
        double[] response_ratio = new double[n];
        for(int i = 0; i < n; i++){
            response_ratio[i] = 1 + (processes[i].waiting_time / processes[i].burst_time);
        }
        return response_ratio;
    }
    public static void displayResponseRatio(Ques1.Process[] processes, double[] response_ratio){
        System.out.println("\nPID\tWT\tBT\tResponse Ratio");
        for(int i = 0; i < processes.length; i++){
            System.out.println(processes[i].pid+"\t"+processes[i].waiting_time+"\t"+processes[i].burst_time+"\t"+response_ratio[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Ques1.Process[] processes = Ques1.inputProcesses(n);
        Ques1.calculateCompletionTime(processes);
        Ques1.calculateWTandTAT(processes);
        double[] response_ratio = responseRatio(processes);
        displayResponseRatio(processes, response_ratio);
        scanner.close();
    }
}