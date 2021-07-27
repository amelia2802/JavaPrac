/**
 * Print following output using nested for loops:
    1
    22
    333
    4444
    55555
    666666
    7777777
    
    @author Amelia
 */

public class DoubleNumPyr {
     public static void main(String[] args) {
        for(int i=1;i<=7;i++){      //Assign the outer for-loop as row
            for(int j=1;j<=i;j++){  //Assign the inner for loop as column
                System.out.print(i);//Print the row no to make the pyramid
            }
            System.out.println();
        }
    }
}
