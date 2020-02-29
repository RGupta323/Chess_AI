import java.util.Arrays;

public class Main {
    public static String[][] chessboard;
    public static void main(String[] args){
        Pawn p = new Pawn("black", 1, 0);
        initializeChessboard();
        printBoard(chessboard);
    }

    //method to initialize chessboard
    public static void initializeChessboard(){
        chessboard= new String[8][8];
        for(int i=0; i<chessboard.length; i++){
            for(int j=0; j<chessboard[i].length; j++){
                chessboard[i][j]="X";
            }
        }
    }
    //method to print the chessbaord
    public static void printBoard(String[][] board){
        for(int i=0; i<board.length; i++){
            System.out.print("[");
            System.out.print(Arrays.toString(board[i])+",\n");

        }
        System.out.print("]");
    }
}
