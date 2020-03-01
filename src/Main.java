import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static String[][] chessboard;
    public static void main(String[] args){
        //Pawn p = new Pawn("black", 1, 0);

        initializeChessboard();
        printBoard(chessboard);
        System.out.println();
        updateBoard(generateBlackPawns());
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
        System.out.print("[");
        for(int i=0; i<board.length; i++){
            //System.out.print("[");
            System.out.print(Arrays.toString(board[i])+",\n");

        }
        System.out.print("]");
    }
    //method to modify board, based on chess pieces

    //method to generate all black pawns as a list, list of references.
    //for our case, all black pawns are gonna occupy the 6th row or the second
    //to last row.
    public static List<Pawn> generateBlackPawns(){
        List<Pawn> pawns = new LinkedList<>();
        String color="black"; int x_pos=6;
        for(int i=0; i<8; i++){
            Pawn p = new Pawn(color, x_pos, i);
            pawns.add(p);
        }
        //System.out.println(Arrays.toString(pawns.toArray()));
        return pawns;
    }
    //method to update board, takes in a list of Chess pieces and updates the chessboard
    public static void updateBoard(List<Pawn> pawns){
        updateBoard_Pawns(pawns);
    }
    //new method, deals with Pawn objects only... this whole object converting
    //Pawn objects to chess pieces is goddamn bull crap
    public static void updateBoard_Pawns(List<Pawn> p){
        for (Pawn pawn : p){
            ChessPosition<Integer> cp = new ChessPosition<>(pawn.x_pos, pawn.y_pos);
            chessboard[cp.x][ cp.y] = pawn.color+" "+pawn.type;
        }
    }
}
