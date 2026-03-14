//Find the Sum of All Elements.

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
    }
}
