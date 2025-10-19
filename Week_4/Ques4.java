package Week_4;

import java.util.List;

public class Ques4 {
    public static Ques1.Process selectShortestJob(List<Ques1.Process> readyQueue){
        if(readyQueue == null || readyQueue.isEmpty()){
            return null;
        }
        Ques1.Process shortest = readyQueue.get(0);
        for(Ques1.Process p : readyQueue){
            if(p.burst_time < shortest.burst_time){
                shortest = p;
            }
        }
        return shortest;
    }
    public static void displaySelectedProcess(Ques1.Process process){
        if(process != null){
            System.out.println("Next Selected Process (SJN): "+process.pid+" with burst time: "+process.burst_time);
        }else{
            System.out.println("No process available in Ready Queue");
        }
    }
}