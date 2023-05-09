import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
    static void swap(int arr[] , int i ,int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }
    static void reverse(int arr[]){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            swap(arr , i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[7];
        Scanner in = new Scanner(System.in);
        for(int i =0;i<arr.length ; i++){
            arr[i]=in.nextInt();
        }
        reverse(arr);
       for(int j =0;j<arr.length;j++){
           System.out.print(String.valueOf(arr[j])+" ");
       }
       swap(arr , 3,4);
        System.out.println();
        for(int j =0;j<arr.length;j++){
            System.out.print(String.valueOf(arr[j])+" ");
        }
    }
}