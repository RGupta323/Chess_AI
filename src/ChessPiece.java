import java.util.Set;

public class ChessPiece {
    public String color;
    public int x_pos;
    public int y_pos;

    //chess piece
    public ChessPiece(String color, int x, int y){
        x_pos=x;
        y_pos=y;
        this.color=color;
    }
}
