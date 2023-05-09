import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("reverse a number::");
        Scanner in = new Scanner(System.in);
        int num = in .nextInt(); int ans=0;
        while(num>0) {
            int rem = num % 10;
            ans = (ans * 10) + rem;
            num = num / 10;
        }
        System.out.println("the reverse is ::" + ans );
    }
}