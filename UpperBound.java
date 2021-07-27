/**
 *  Write a program to calculate the sum of the numbers from 1 till upper bound.
    If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
    If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
    If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

    You should use while loop.
   
 */

public class UpperBound {
    public static void main(String[] args) {
        int ctr = 1;    //Initialize the counter  variable as 1;
        int sum = 0;    //Initialize sum value 0
        while(ctr<=100){  //summation of the upper bound
            sum = sum + ctr;
            ctr++;
        }
        System.out.println(sum);    //print the sum
    }
}
