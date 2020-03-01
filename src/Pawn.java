import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pawn extends ChessPiece {
    String color; int x_pos; int y_pos;
    boolean notMoved; String type;
    List<ChessPosition<Integer>> moves;
    public Pawn(String color, int x_pos, int y_pos) {
        this.color = color;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        notMoved=true;
        moves=new LinkedList<>();
        type=toString();
    }
    //methods

    //move(), method that verifies if a pawn has legal move and updates its current position.
    public void move(int x_pos1, int y_pos1)throws Exception{
        //check if its a legal move.
        if(notMoved){
            if((x_pos+1==x_pos1 || x_pos+2==x_pos1) && (y_pos1==y_pos)){
                x_pos=x_pos1;
                y_pos=y_pos1;
                notMoved=false;
            }
            else{
                throw new Exception ("Illegal Move, Pawn");
            }
        }
        else{
            if(x_pos+1==x_pos1 && y_pos1==y_pos){
                x_pos=x_pos1;
                y_pos=y_pos1;
            }
            else{
                throw new Exception("Illegal move, Pawn");
            }
        }
        x_pos=x_pos1; y_pos=y_pos1;
    }
    //options (creates a data structure of options grid where the piece can move based on the its original coordaintes

    //make drawPath(), maps the path in which the pawn takes. (this will be used to draw with the GUI)
    public void updateMoves(Integer x_pos, Integer y_pos){
        List<ChessPosition<Integer>> a = new LinkedList<>();
        ChessPosition<Integer> c = new ChessPosition(x_pos, y_pos);
        a.add(c);

    }

    //methods for capture
    public boolean canCapture(String[][] board){
       if(color=="black" || color.equals("black")){
           //pawns can capture diagonally, but black pawns are located at the end
           //of the board, so
           //capture diagonal left: (x_pos-1, y_pos-1) but pawns at the end of the
           //capture diagonal right: (x_pos+1, y_pos+1)
           //board can only capture diagonally one way
           ChessPosition<Integer> diagonal_left=new ChessPosition(x_pos-1, y_pos-1);
           ChessPosition<Integer> diagonal_right=new ChessPosition<>(x_pos+1, y_pos+1);

           if(diagonal_left.x>=0 && diagonal_left.x<8){
               
           }

       }
    }

    //toString method to show what type it is...
    public String toString(){
        return "Pawn";
    }
}
