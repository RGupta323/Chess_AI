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
    public void move(int x_pos1, int y_pos1){
        x_pos=x_pos1;
        y_pos=y_pos1;
    }
    public void updateMoves(Integer x_pos, Integer y_pos){
        moves.add(new ChessPosition(x_pos,y_pos));
    }
    @Override
    public String toString() {
        return color+" "+"Rook";
    }
}
