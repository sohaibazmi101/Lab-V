package Week_4;

public class Ques1 {
    public static class Process{
        String pid;
        double arrival_time;
        double burst_time;
        public Process(String pid, double arrival_time, double burst_time){
            this.pid = pid;
            this.arrival_time = arrival_time;
            this.burst_time = burst_time;
        }
    }
}