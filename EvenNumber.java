/**
 * Write a program using while loop to print Even numbers from 1 to 100.
 * @author Amelia
 */

public class EvenNumber {
     public static void main(String[] args) {
         int num = 0;           //Initialize the number value
         while(num<100){        //Bound up the number upto 100
             if(num%2==0){      //Check the even ones
                System.out.println(num);    //Print the even ones
             }
             num++;             //Increment the num variable
         }  
     }
}