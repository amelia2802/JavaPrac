/**
     * Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
    Numbers divisible by 2 are even and numbers not divisible by 2 are odd.

    @author Amelia
 */

 /*public class EvenOdd {
    public static void main(String [] args){
        int numbers = 9;
        switch (numbers%2) {//// 4 % 2 == 0 -> 4 is even, 5 % 2 == 1 -> 5 is odd,
            case (0):
                System.out.println("Even");//Numbers divisible by 2 are even
                break;
            default:
                System.out.println("Odd");//numbers not divisible by 2 are odd.

                break;
        }
    }    
}*/

/**
 * Write a Java Program to solve Question 2 using ternary operator (?:).
 * @author Amelia
 */

 public class EvenOdd{
    public static void main(String[] args) {     
        int numbers = 21;
        String result = (numbers%2==0) ? "Even":"Odd" ; 
        System.out.println(result);
     }
}
