/**
 *  Print the table of 12 using for loop.
    Output should be in following format:
    12 X 1 = 12
    12 X 2 = 24
    12 X 3 = 36
    12 X 4 = 48
    12 X 5 = 60
    12 X 6 = 72
    12 X 7 = 84
    12 X 8 = 96
    12 X 9 = 108
    12 X 10 = 120
 */

 /*public class MultiplicationTable{
     public static void main(String[] args){
         int mp = 12;   //Initialize the multiplier value
         for(int i=1;i<=10;i++){    //Intialize and increment the multiple value
             int res = mp*i;        //store the multiplication
             System.out.println(mp+" X "+i+" = "+res);  //display the table
         }
     }
 }*/

 /**
  * Solve Question-1 using while loop.
    @author Amelia
  */
  public class MultiplicationTable{
    public static void main(String[] args){
        int mp = 12;   //Initialize the multiplier value
        int i = 1;     //Intialize the multiple value
        while(i<=10){
            int res = mp*i;        //store the multiplication
            System.out.println(mp+" X "+i+" = "+res);//display the table
            i++;                //Increment the multiple value
        }
    }
}
