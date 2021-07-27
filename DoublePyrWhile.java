/**
 * Print following output using nested while loops:
    1
    22
    333
    4444
    55555
    666666
    7777777

    @author Amelia
 */

public class DoublePyrWhile {
    public static void main(String[] args){
        int i = 0;      //variable is declared outside while loop
        while(++i<=7){  //outer loop executes 7 times
            int j = 0;   //variable to be used in inner while loop.
            while(++j<=i){  //inner loop
                System.out.print(i);
            }
            System.out.println();   //New line at the end of each row
        }
    }
}
