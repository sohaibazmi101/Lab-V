package Week_1;

import java.util.Scanner;

class Ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter burst time in seconds: ");
        int seconds = scanner.nextInt();
        int hour = seconds / 3600;
        int remaingSeconds = seconds % 3600;
        int minute = remaingSeconds / 60;
        remaingSeconds = remaingSeconds % 60;
        System.out.printf("HH:MM:SS = %02d:%02d:%02d\n", hour, minute, remaingSeconds);
        scanner.close();
    }
}