import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        System.out.println("pattern questions");

        //this is the code for making solid rectangle using loops
        System.out.println("the first pattern is solid rectangle::");
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of rectangle");
        int row = in.nextInt();
        int column = in.nextInt();
        //loops starts
        for(int i =1 ; i<=row ; i++){

            for(int j=1 ;j<=column ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //code ends..


        System.out.println("Second pattern is hollow rectangle::");
        System.out.println("enter the dimensions::");
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||j==m||i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //code ends..

        System.out.println("Third pattern is half pyramid");
        System.out.println("enter the dimensions");
        int A= in.nextInt();
        for(int i=1;i<=A;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //code ends



        System.out.println("Third pattern is inverted half pyramid");
        System.out.println("enter the dimensions");
        int B= in.nextInt();
        for(int i=B;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //code ends

        System.out.println("pattern no 6");
        System.out.println("enter the dimension");
        int x = in.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //code ends


        System.out.println("inverted number pattern no 7");
        System.out.println("enter the dimension");
        int y=in.nextInt();
        for(int i =y;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("floyd's pyramid::");
        System.out.println("add dimensions");
        int c=in.nextInt();
        int num=1;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }

        //code ends..


        System.out.println("logical on off pattern");
        System.out.println("enter the input ::");
        int d = in.nextInt();
        for(int i=1;i<=d;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}