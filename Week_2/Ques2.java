package Week_2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] process = new int[5];
        for(int i = 0; i< 5; i++){
            System.out.print("Enter Priority of Process P"+(i+1)+" (1 = High, 2 = Medium, 3 = Low): ");
            process[i] = scanner.nextInt();
        }
        scanner.close();

        int minPriority = process[0];
        int processIndex = 0;
        for(int i = 0; i < 5; i++){
            if(process[i] < minPriority){
                minPriority = process[i];
                processIndex = i;
            }
        }
        System.out.println("Process Run first is P"+(processIndex+1)+" (Priority is "+minPriority+")");
    }
}
