package Week_5;

import java.util.*;

public class Ques4 {
    public static void simulateReadyQueue(Ques1.Process processes){
        Arrays.sort(processes, Comparator.comparingDouble(p -> p.arrival_time));
        Queue<Ques1.Process> readyQueue = new LinkedList<>();
    }
}
