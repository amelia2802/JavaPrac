/**
 * Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
    which are divisible by 5.
    @author Amelia
 */

public class DivisibleFive {
    public static void main(String[] args){
        for(int i = 1; i<=100;i++){     //Initialize the numbers and bound upto 100
            if(i%5==0){                 //check whether it's divisible by 5.
                System.out.println(i);  //display the integer value which are divisible by 5 & increment the integer
            }
        }
    }
}
