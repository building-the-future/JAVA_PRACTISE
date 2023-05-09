import java.sql.SQLOutput;
import java.util.Scanner;

public class functions{
    public static void prime(int n){
        int c = 2;
        while(c<=n){
            if(n%2==0){
                System.out.println("not prime");
                break;
            }
            else {
                System.out.println("prime");
                break;
            }
        }
        c++;
        return;
    }
    public static void table(int a){
        for(int i =1;i<=10;i++){
            System.out.println(a+" x "+i+" = "+ a*i);
        }
    }
    public static void SumOfNaturalNum(int a){
    int sum =0;
            for(int i =a;i>=1;i--){
                sum = sum + i;
            }
        System.out.println(sum);

    }
    public static void avg(int a,int b,int c){
        int average = (a+b+c)/3;
        System.out.println(average);
    }

    public static void sumOfAllOdd(int n){
        int sum =0;
        for(int i =n;i>=1;i--){
            if(i%2!=0){
                sum = sum +i;
            }

        }
        System.out.println(sum);
    }
    public static void infinity(int a){
        int i =0 ;
        do{
            i=i+1;
            System.out.println(i);
        }while(i>0);
    }
    public static void findPosNeg(){
        System.out.println("enter x for ending input::");
        Scanner in = new Scanner(System.in);
        int pos=0 , neg=0 , zeroes = 0;
        System.out.println("write anything to exit");

        while(true) {
            try {
                int p = in.nextInt();
                if (p < 0) {
                    neg++;
                } else if (p > 0) {
                    pos++;
                } else {
                    zeroes++;
                }
            }catch(Exception e){
                break;
            }
        }
        System.out.println("the pos are : "+pos);
        System.out.println("the neg are : "+neg);
        System.out.println("the zeroes are : "+zeroes);

    }
    public static int fibonacci(int n){
        if(n==1||n==0){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(fibonacci(a));


}
}