import java.util.LinkedList;

public class Knight extends ChessPiece{
    //instance variables
        int x_pos;
        int y_pos;
        String color;
        boolean captured;
        LinkedList<ChessPosition<Integer>> moves;
        String type;
    public Knight(String color, int x_pos, int y_pos){
        this.color=color;
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        type="Knight";
        captured=false;
        moves=new LinkedList<>();
    }
    public void move(int x_pos1, int y_pos1){

    }

    public void updateMoves(Integer x_pos, Integer y_pos){
        moves.add(new ChessPosition(x_pos,y_pos));
    }

    @Override
    public String toString() {
        return color+" "+"Knight";
    }
}
