import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        int[]  arr = new int[size];

        // Take inputs from user
        for (int i = 0; i < size; i++){
            System.out.println("Enter value of " + i + " index : ");
            arr[i] = sc.nextInt();
        }

        //print Array
        // ================ WITH ARRAY CLASS ================
        System.out.println("Array : " + Arrays.toString(arr));
        /*
        System.out.print("\nArray : ");
        ================ WITH FOR EACH LOOP ================
            for(int num : arr) {
                System.out.print(num + " ");
            }
        ================ WITH FOR LOOP ================
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

        */
    }
}