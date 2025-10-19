package Week_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Ques1.Process[] processes = Ques2.inputProcess(n);
        System.out.println("Display Process: ");
        Ques2.displayProcess(processes);
        double[] completion_time = Ques3.completionTime(processes);
        System.out.println("Display Completio Time: ");
        Ques3.displayCompletionTime(processes, completion_time);
        List<Ques1.Process> readyQueue = new ArrayList<>();
        for(Ques1.Process p : processes){
            readyQueue.add(p);
        }
        System.out.println("Select next process (SJN): ");
        Ques1.Process nextProcess = Ques4.selectShortestJob(readyQueue);
        Ques4.displaySelectedProcess(nextProcess);
        scanner.close();
    }
}
