/**
 *  Same as Question 1. java.util.Arrays class has various utility methods to work with Arrays.
    Instead of writing your own logic to sort the passed int [] object in the method, you have to use a method from java.util.Arrays class to solve it.
    @author Amelia
 */

package oop;
import java.util.Arrays;
import java.util.Scanner;

public class sortTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        ascMethod.printIntArray(array);

        Arrays.sort(array);

        System.out.println("Array after sorting:");
        ascMethod.printIntArray(array);

        sc.close();
    }
}
