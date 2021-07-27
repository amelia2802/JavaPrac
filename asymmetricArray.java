/**
 * Following code creates an asymmetrical 2-Dimensional int array:
    int [][] numbers = {
    {90, 10, 231},
    {-20, 80, 100, 23, 54},
    {45, 22},
    {87, 98, -100, 49, 73, 35, 19}
    };
    Write logic to find out highest number in above array.
    @author Amelia 
 */
public class asymmetricArray {
    public static void main(String[] args){
        int [][] numbers = {
            {90, 10, 231},
            {-20, 80, 100, 23, 54},
            {45, 22},
            {87, 98, -100, 49, 73, 35, 19}
            };
        int max = numbers[0][0];//Store first array element (at row = 0, col = 0) to variable max

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                //If value of max is less than current array element's value then
				//replace the value of max with current array element's value.
                if(max<numbers[i][j]){
                    max = numbers[i][j];
                    System.out.println("The highest no is: "+max);
                }
            }
        }
    }
}
