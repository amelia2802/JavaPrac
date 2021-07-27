/**
 * Use pre-decrement operator in while's boolean_expression to print HELLO 5 times on to the console.
 * @author Amelia
 */

 public class ExampleWhile{
     public static void main(String[] args){
         
        //initialize the counter value to 0
         int ctr = 0;

         //put the pre incremented counter variable with the condition
         while (++ctr<=5) {
             System.out.println("Hello");   //print the statement
         }
     }
 }