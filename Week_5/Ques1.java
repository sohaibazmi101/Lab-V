package Week_5;
import java.util.Scanner;

public class Ques1 {
        public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }
            else{
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            mergedArray[k++] = arr1[i++];
        }
        while(j < arr2.length){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args){
        int l1,l2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        l1 = scanner.nextInt();
        System.out.print("Enter the size of second array : ");
        l2 = scanner.nextInt();
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];
        int[] sortedArray = new int[l1+l2];
        System.out.print("enter the sorted Elements of the array : ");
        for(int i = 0; i < l1; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the sorted Elements of second array : ");
        for(int i = 0; i < l2; i++){
            arr2[i] = scanner.nextInt();
        }
        sortedArray = mergeSortedArray(arr1, arr2);
        System.out.println("sorted Array : ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i]+" ");
        }
        scanner.close();
    }
}
