package Week_4;

import java.util.Scanner;

public class Ques2 {
    public static Ques1.Process[] inputProcess(int n){
        Scanner scanner = new Scanner(System.in);
        Ques1.Process[] processes = new Ques1.Process[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the details of process "+(i+1) +" : ");
            System.out.print("Process ID: ");
            String pid = scanner.nextLine();
            System.out.print("Arrival Time: ");
            double arrival_time = scanner.nextDouble();
            System.out.print("Burst Time: ");
            double burst_time = scanner.nextDouble();
            scanner.nextLine();
            processes[i] = new Ques1.Process(pid, arrival_time, burst_time);
        }
        scanner.close();
        return processes;
    }
    public static void displayProcess(Ques1.Process[] processes){
        System.out.println("\nPiD\t\tarrival time\tburst time");
        for(Ques1.Process p : processes){
            System.out.println(p.pid+"\t\t"+p.arrival_time+"\t\t"+p.burst_time);
        }
    }
}
