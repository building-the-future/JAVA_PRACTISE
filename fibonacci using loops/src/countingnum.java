

import java.util.Scanner;
public class countingnum{
    public static void main(String[] args) {
        System.out.println("count the numbers:");
         Scanner inp = new Scanner(System.in) ;
         int a = inp.nextInt();
        System.out.println("enter the num for counting");
        int b = inp.nextInt();
        int count=0;
         while(a>0){
             int rem = a%10;
             if(rem ==b){
                 count++;
             }
             a /=10;
         }
        System.out.println(count);

    }
}

