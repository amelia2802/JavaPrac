/**
 * Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
    1    2    3    4    5    6    7    8    9    10    
    11    12    13    14    15    16    17    18    19    20    
    21    22    23    24    25    26    27    28    29    30    
    .
    .
    .
    991    992    993    994    995    996    997    998    999    1000  

    @author Amelia
 */

public class OneDarray {
    public static void main(String[] args){
        int array[] = new int[1000];    //Create a primitive array variable
        for(int i=0,j=1;i<=array.length-1;i++,j++){    //Initialize the array with starting index i=0 to upper bound & put the values of array->j=1
            array[i] = j;   //assigned the values to the respective array
            System.out.println(array[i]);   //print the array
        }
    }
}
