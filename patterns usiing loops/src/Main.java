import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("this program tells if the number is capital or not::\n");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("not capital");
            } else {
                System.out.println("capital");
            }

    }
}