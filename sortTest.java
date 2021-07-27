/**
 * Test class of ascSort;
 * @author Amelia 
 */

package src;
import java.util.Scanner;

public class sortTest {
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

        ascMethod.sort(array);

        System.out.println("Array after sorting:");
        ascMethod.printIntArray(array);

        sc.close();
    }
}
