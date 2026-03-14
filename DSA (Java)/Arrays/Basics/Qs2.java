//Find the Sum of All Elements.
import java.util.*;
public class Qs2 {
    public static void main(String[] args){
        int[] arr = {100,200,700,1000,3000};
        System.out.println("Array elements are:");
        for( int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        int sum = 0;
        for(int j =0 ; j < arr.length ; j++){
            sum+=arr[j];
        }
        System.out.println("Sum: " + sum);

        //Using user inputs :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter " + n +  " elements :");
        for( int x = 0 ; x < n ; x++){
            arry[x] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int y = 0 ; y < arry.length ; y++){
            System.out.println(arry[y]);
        }
        System.out.println("Sum of Elements:");
        int Sum = 0;
        for(int k = 0 ; k < arry.length ; k++){
            Sum = Sum + arry[k];
        }
        System.out.println(Sum);
    }
}

