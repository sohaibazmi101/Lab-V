package Week_2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of process: ");
        int total_process = scanner.nextInt();
        scanner.nextLine();
        String[] process = new String[total_process];
        for(int i = 0; i < total_process; i++){
            System.out.print("Enter the name of Process "+(i+1)+": ");
            process[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Process will execute in Order: ");
        for(int i = 0; i < total_process; i++){
            System.out.println((i+1)+". Process: "+process[i]);
        }
    }
}
