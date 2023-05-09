import java.util.Scanner;
public class fib{
    public static void main(String[] args) {
        System.out.println("fibonacci series");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long a=0L;
        long b=1L;
        int count;
        for(count =2;count<=num ; count++){
            long tem =b;
            b +=a;
            a=tem;
            System.out.print(b+"\t");
        }
        System.out.println("the fibonacci num for "+num+ "is :- " + b);
    }
        }