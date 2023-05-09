import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("calculator program");
        System.out.println("enter x for ending the program");
        Scanner in = new Scanner(System.in);
        int ans =0;
        while(true){
            System.out.print("enter the operators::");
            char ch = in.next().trim().charAt(0);
            if(ch == 'x' ||ch=='X'){
                break;
            }

                System.out.println("enter the operands::");
                int n1= in.nextInt();
                int n2 = in.nextInt();

                if(ch=='+'){
                    ans = n1+n2;
                }
                if(ch=='-'){
                    ans = n1-n2;
                }
                if(ch=='*'){
                    ans = n1*n2;
                }
                if(ch=='/'){
                    ans = n1/n2;
                }


            else{
                System.out.println();
            }
            System.out.println("the answer is :: "+ans);
        }
    }
}
