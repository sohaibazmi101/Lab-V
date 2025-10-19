package Week_4;

public class Ques3 {
    public static double[] completionTime(Ques1.Process[] processes){
        int n = processes.length;
        double[] completion_time = new double[n];
        double current_time = 0;
        for(int i = 0; i < n; i++){
            if(current_time < processes[i].arrival_time){
                current_time = processes[i].arrival_time;
            }
            current_time += processes[i].burst_time;
            completion_time[i] = current_time;
        }
        return completion_time;
    }
    public static void displayCompletionTime(Ques1.Process[] processes, double[] completion_time){
        System.out.println("\nPiD\tCompletion Time");
        for(int i = 0; i < processes.length; i++){
            System.out.println(processes[i].pid+"\t"+completion_time[i]);
        }
    }
}
