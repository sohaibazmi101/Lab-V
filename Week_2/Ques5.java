package Week_2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Enter a String : ");
        string = scanner.nextLine();
        scanner.close();
        boolean cond = true;
        for (int i = 0; i < string.length() / 2; i++) {

            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                cond = true;
            } else {
                cond = false;
                break;
            }

        }
        if (cond) {
            System.out.println(string + " is Palindrome");
        } else {
            System.out.println(string + " is Not palindrome");
        }
    }
}
