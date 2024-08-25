package Week_4;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter the length of Matrix : ");
        length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of Array : ");
        for(int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max elemnts = "+max);
        scanner.close();
    }
}
