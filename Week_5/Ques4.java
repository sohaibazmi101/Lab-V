package Week_5;

import java.util.Scanner;

public class Ques4 {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Ques4(int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full. Cannot push "+value);
        }
        else{
            stackArray[++top] = value;
            System.out.println(value+" Pushed Successfully");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty. Unable to Pop");
            return -1;
        }
        else{
            return stackArray[top--];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }
        else{
            System.out.print("Stack ---> ");
            for(int i = 0; i <= top; i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Stack : ");
        int size = scanner.nextInt();

        Ques4 q4 = new Ques4(size);
        boolean condition = true;
        int choice, item;
        while(condition == true){
            
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice : ");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("Enter Item to Push : ");
                item = scanner.nextInt();
                q4.push(item);
            }else if(choice == 2){
                item = q4.pop();
                if(item != -1){
                    System.out.println(item+ " Popped Successfully");
                }
            }else if(choice == 3){
                q4.display();
            }else if(choice == 4){
                condition = false;
            }else{
                System.out.println("Invalid Input try Again");
            }
        }
        scanner.close();
    }
}
