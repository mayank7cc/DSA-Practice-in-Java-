import java.util.Scanner;

// Given an array, print all its elements.
public class Qs1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {10,20,30,40,50};
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        //With user inputs:
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        sc.close();

    }
}
