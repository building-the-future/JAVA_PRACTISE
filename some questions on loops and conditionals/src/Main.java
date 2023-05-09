import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("enter three number and find which one is largest");
        int max;
        Scanner num = new Scanner(System.in);
        System.out.println("enter first");
        int a = num.nextInt();
        System.out.println("enter second");
        int b = num.nextInt();
        System.out.println("enter third");
        int c = num.nextInt();
        max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}