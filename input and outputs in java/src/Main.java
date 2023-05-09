import java.util.Scanner;

public class Main{
    public static void main(String[] Args){
//        System.out.println("first program::hello world program");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
////        System.out.println(a);
//        System.out.println("enter the number::");
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        System.out.println("enter the number");
//        int b = sc.nextInt();
//        System.out.println("enter the number");
//        int c = sc.nextInt();
//
//        int max;
//        max = a;
//
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println("the max is :: " + max);


//        System.out.println("::::::::reverse a number:::::::");
//        Scanner inputs = new Scanner(System.in);
//
//        int num = inputs.nextInt();
//        int ans =0;
//        while(num>0){
//            int rem = num %10;
//            ans = (ans*10) +rem ;
//            num /= 10;
//
//
//        }
//        System.out.println("the reversed num is :: " + ans);

            Scanner ch = new Scanner(System.in);
            char in = ch.next().trim().charAt(0);
            if(in>='a' && in<='z'){
                System.out.println("non capital letter");
            }
            else
                System.out.println("capital letter");
    }
}