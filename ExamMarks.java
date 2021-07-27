import javax.naming.spi.DirStateFactory.Result;

/**
 * Write a java program for following logic.
    if marks < 60, then print "Fail"
    if marks >= 60 but less than 90 , then print "Pass"
    if marks >= 90, then print "Passed with Distinction"

    You are free to use any combination of if - else statements.
    You can either use if statements OR if - else statements OR if - else if - else statements.

    Extra marks if you can solve using all 3 combinations :)
    
    @author Amelia
 */

 /*public class ExamMarks{
     public static void main(String[] args){
         int marks = 110;

         //if marks < 60, then print "Fail"
         if(marks<60){
             System.out.println("Fail");
         }
         //if marks >= 60 but less than 90 , then print "Pass"
         else if(marks<90){
             System.out.println("Pass");
         }
         //if marks >= 90, then print "Passed with Distinction"
         else if(marks<=100){
             System.out.println("Passed with Distinction");
         }
         else{
             System.out.println("Error!!!Check your marks again!!!!");
         }
     }
 }*/

 /**
     * Write a Java Program to solve Question 1 using ternary operator (?:).
    @author Amelia
  */
public class ExamMarks{
  public static void main(String[] args) {
    int marks = 99;
    String Result = (marks>=90) ? "Passed with Distinction" : (marks>=60) ? "Pass" : "Failed";
    System.out.println(Result);
    
    }
}
