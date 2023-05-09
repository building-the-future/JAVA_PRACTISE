import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        System.out.println("we are going to make a calculator");
        Scanner in = new Scanner(System.in);
//        float ans =0;
//        while(true){
//            System.out.print("Enter the Operator::");
//            char op = in.next().trim().charAt(0);
//            if(op =='+'||op=='-'||op=='*'||op=='/'||op=='%'){
//                System.out.println("Enter the operands::");
//                float num1= in.nextFloat();
//                float num2 = in.nextFloat();
//                if(op=='+'){
//                    ans = num1+num2;
//                }if(op=='-'){
//                    ans = num1-num2;
//                }
//                if(op=='*'){
//                    ans = num1*num2;
//                }
//                if(op=='/'){
//                    ans = num1/num2;
//                }
//                if(op=='%'){
//                    ans = num1%num2;
//                }
//            }
//            else if(op=='x' ||op=='X'){
//                break;
//            }
//            else{
//                System.out.println("ENTER VALID OPERATION");
//            }
//            System.out.println(ans);
//        }
//    }
//}
        char op = in.next().trim().charAt(0);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(true){

            switch(op){
                case '+' -> System.out.println(num1 +num2);
                case '-' -> System.out.println(num1 -num2);
                case '*' -> System.out.println(num1 *num2);
                case '/' -> System.out.println(num1 /num2);
                case '%' -> System.out.println(num1 %num2);
                default -> System.out.println("ENTER VALID OPERATOR");
            }
            if(op=='x'||op=='X')
                break;
        }
        }
    }
