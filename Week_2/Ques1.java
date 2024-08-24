package Week_2;

public class Ques1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Series : "+a+" "+b);
        for(int i = 2; i<10;i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.println();
    }
}
