/**
 * Write a java program to create following 2-Dimensional array of 8 * 8 size [to resemble chess board] using Data instantiation:
    W       B       W       B       W       B       W       B
    B       W       B       W       B       W       B       W
    W       B       W       B       W       B       W       B
    B       W       B       W       B       W       B       W
    W       B       W       B       W       B       W       B
    B       W       B       W       B       W       B       W
    W       B       W       B       W       B       W       B
    B       W       B       W       B       W       B       W

    @author Amelia
Write a nested for loop to print all the elements of 2-Dimensional array in above format.
 */

public class twoDimentionalChess {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        String team;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if((i+j)%2!=0){
                    team = "B";
                    board[i][j] = team;
                }
                else{
                    team = "W";
                    board[i][j] = team;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println(" ");
        }

    }
}
