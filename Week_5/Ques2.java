package Week_5;

public class Ques2 {
    public static void displayGanttChart(Ques1.Process[] processes){
        for(Ques1.Process p : processes){
            System.out.print(" ");
            for(int i = 0; i < (int)p.burst_time; i++){
                System.out.print("--");
            }
        }
        System.out.println();
        for(Ques1.Process p : processes){
            System.out.print(" | ");
            System.out.print(p.pid);
            int spaces = (int)p.burst_time - 1;
            for(int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
        }
        System.out.println(" | ");
        for(Ques1.Process p : processes){
            System.out.print(" ");
            for(int i = 0; i < (int)p.burst_time; i++){
                System.out.print("--");
            }
        }
        System.out.println();
        double current_time = 0;
        System.out.print("0");
        for(Ques1.Process p : processes){
            if(current_time < p.arrival_time){
                current_time = p.arrival_time;
            }
            current_time += p.burst_time;
            System.out.print("   "+(int)current_time);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Ques1.Process p1 = new Ques1.Process("P1", 0, 4);
        Ques1.Process p2 = new Ques1.Process("P2", 1, 3);
        Ques1.Process p3 = new Ques1.Process("P3", 2, 5);
        Ques1.Process[] processes = {p1, p2, p3};
        displayGanttChart(processes);
    }
}