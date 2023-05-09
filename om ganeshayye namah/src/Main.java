import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("hello everyone");
        Scanner input = new Scanner(System.in);
        System.out.println("learning is the key");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
    }
}
