package Lec32;
import java.util.*;
public class User_Input {
    public static void main(String args[]) {
      int []arr=Take_input();
      Display(arr);
    }
    public static int [] Take_input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a= new int [n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public static void Display(int []arr){
          for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
        }
    }
}