import java.util.Scanner;
public class linearsearch{
    public static void main(String[] args) {
        System.out.println("initializing and linear search in 2 D array");
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row and column of the 2-D array::");
        int r =in.nextInt();
        int c =in.nextInt();
        int arr[][]= new int[r][c];
        System.out.println("enter the elements of the array::");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Here is your 2-D array::");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter the element for searching::");
        int a = in.nextInt();
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
              if(arr[i][j]==a){
                  System.out.println("The Element is at ::\nROW - "+i+"   ::::   COLUMN - "+c);
                  break;
              }

            }

        }

    }
}