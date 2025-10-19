package Week_1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PID;
        System.out.print("Enter a process ID (PID): ");
        PID = scanner.nextInt();
        scanner.close();
        if(PID % 2 == 0){
            System.out.println("System Process");
        }else{
            System.out.println("User Process");
        }
    }
}
