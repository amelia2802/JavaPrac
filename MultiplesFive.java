/**
 * Print the multiples of 5 starting from 200 to 5 with following restrictions:
    1. Use for loop
    2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.

    @author Amelia .
 */

public class MultiplesFive {
    public static void main(String[] args){
        //Loop should start with 200 and should end with 5.
		//Here for loop starts the iteration with i = 200 and goes until i >= 5
		//Step expression is: i -= 5, which means, i = i - 5
		//this decrements the value of i by 5 after every iteration, thus giving
		//us next number divisible by 5
        for(int num = 200;num>=5;num-=5){
            System.out.println(num);
        }
    }
}
