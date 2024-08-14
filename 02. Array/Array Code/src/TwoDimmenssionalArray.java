import java.util.Arrays;
import java.util.Scanner;

public class TwoDimmenssionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns : ");
        int cols = sc.nextInt();
       /*
        ================ 2D array initialization ================
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };*/
        //================ 2D array Declaration ================
        int[][] arr2D = new int[rows][cols];

        System.out.println(arr2D.length); // No of rows

        //================ Taking Input ================
        for (int row = 0; row < arr2D.length; row++){
            for(int col = 0; col <arr2D[row].length; col++){
                System.out.println("Enter array value " + "[" + row +"]" + "["+col+"] :");
                arr2D[row][col] = sc.nextInt();
            }
        }

        //================ Printing Output ================

        for (int row = 0; row < arr2D.length; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }
        /*
           //================ Using For Loop ================
           for (int row = 0; row < arr2D.length; row++){
            for(int col = 0; col <arr2D[row].length; col++){
                System.out.println(col + " ");
            }
            System.out.println();
        }
        */

    }
}
