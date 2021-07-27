/** Write a program to accept an int value from the user until user provides 0.
    Display the same value in the output.
    For non-zero values, re-run the logic.
    NOTE: Use of do-while loop is must in the logic.
    One of the results of the execution:
    Enter 0 to exit: 100
    You entered: 100
    Enter 0 to exit: -1
    You entered: -1
    Enter 0 to exit: 5
    You entered: 5
    Enter 0 to exit: 0
    You entered: 0
 * 
 */

package practice;
import java.util.Scanner;

public class doZeroinput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      do{
          System.out.println("Enter 0 to exit");
          int num = sc.nextInt();
          if(num==0){
              break;
          }
          else{
              continue;
          }
      }while(true);  
    }
}
