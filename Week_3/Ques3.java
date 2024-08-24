package Week_3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int j=0;
        int k = 0;
        System.out.println("Enter a String : ");
        string = scanner.nextLine();
        scanner.close();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e'
             || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ){
                k++;
            } else {
                j++;
            }
        }
        System.out.println("Number of vowels = "+k);
        System.out.println("Number of Consonants = "+j);

    }
}
