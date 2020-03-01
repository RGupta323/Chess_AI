public class Rook extends ChessPiece{
    int x_pos;
    int y_pos;
    String color;
    public Rook(String color, int x_pos, int y_pos){
        this.color=color;
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        type="Rook";
    }

    @Override
    public String toString() {
        return color+" "+"Rook";
    }
}
