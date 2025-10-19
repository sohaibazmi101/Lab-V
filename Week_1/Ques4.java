package Week_1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_printers, total_users;
        System.out.print("Enter total Number of Printers: ");
        total_printers = scanner.nextInt();
        System.out.print("Enter total Number of users: ");
        total_users = scanner.nextInt();
        scanner.close();
        int distribution = total_printers / total_users;
        int remaining = total_printers % total_users;
        System.out.println("Each users Get "+distribution+" of printers");
        System.out.println("Remaing Printers: "+remaining);
    }
}
