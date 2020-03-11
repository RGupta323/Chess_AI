import java.util.LinkedList;

public class Rook extends ChessPiece{
    int x_pos;
    int y_pos;
    String color;
    boolean captured;
    String type;
    LinkedList<ChessPosition<Integer>> moves;
    public Rook(String color, int x_pos, int y_pos){
        this.color=color;
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        type="Rook";
        captured=false;
        moves=new LinkedList<>();
    }
    //move(), method that verifies if a pawn has legal move and updates its current position.
    public void move(int x_pos1, int y_pos1)throws Exception{
        //check if its a legal move.
        if(isLegal(x_pos1, y_pos1)) {
            x_pos = x_pos1;
            y_pos = y_pos1;
        }
        else throw new Exception("Illegal move.");
    }
    //method to check if a position is a legal one for the piece
    //for a rook, it can move infinitely in horizontally or vertically but it is up to other classes in this project to determien if there is a peice there or not.
    //this is a simple precautionary measure.
    public boolean isLegal(int x_pos, int y_pos){
        //TODO
        return false;
    }
    public void updateMoves(Integer x_pos, Integer y_pos){
        moves.add(new ChessPosition(x_pos,y_pos));
    }
    @Override
    public String toString() {
        return color+" "+"Rook";
    }
}
