/**
 * In mathematics, the Fibonacci series are the numbers in the following integer sequence:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
    and each subsequent number is the sum of the previous two.

    Write a Java Program to generate above series till n number of times (For example you can try with
    n = 10 and n = 15) and store it in One-dimensional array.
    For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

    Write a for loop to print all the elements of the array.

    @author Amelia
 */

public class arrayFibonacci {
    public static void main(String[] args){
        int n = 10; //If you want Fibonacci Series till 10 numbers then assign 10 to count. Change it to 15 to have Fibonacci Series till 15 numbers.
        int[] arr = new int[n]; //Array to store the series
        arr[0] = 0; //First member of the series is always 0
        arr[1] = 1;  //Second member of the series is always 1

        // Store the values in fib array
        for(int i=2;i<n;i++){   // Array index starting with 2 as values are already assigned to elements at 0th and 1st indexes.
            arr[i] = arr[i-1] + arr[i-2];   //next number is always the sum of previous two numbers
        }


        // Print the values from fib array
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
