package Week_6;

import java.util.Scanner;

public class Ques1 {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Ques1(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }

    public void enQueue(int value){
            if(rear == maxSize - 1){
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
        
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty. Unable to deQueue");
            return -1;
        } else{
            int temp = queueArray[front++];
            if(front == maxSize){
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
        }else{
            System.out.print("Queue ---> ");
            int f = front;
            for(int i = 0; i < nItems; i++){
                System.out.print(queueArray[f]+" ");
                f++;
                if(f == maxSize){
                    f = 0;
                }
            }
            System.out.println();
        }
    }

    public int size(){
        return nItems;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Queue : ");
        int size = scanner.nextInt();
        Ques1 q1 = new Ques1(size);
        boolean condition = true;
        int item, choice;
        while(condition){
            System.out.println("\n1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("\nEnter Your choice : ");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("Enter the item to be pushed : ");
                item = scanner.nextInt();
                q1.enQueue(item);
            }else if(choice == 2){
                item = q1.deQueue();
                if(item != -1){
                    System.out.println(item+" Deleted successfully\n");
                }
            }else if(choice == 3){
                q1.display();
            }else if(choice == 4){
                condition = false;
            }else{
                System.out.println("Invalid Input. Try Again\n");
            }
        }
        scanner.close();
    }
}
