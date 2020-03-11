import java.util.LinkedList;

public class Queen extends ChessPiece{
    //instance variables
    int x_pos;
    int y_pos;
    String color;
    boolean captured;
    LinkedList<ChessPosition<Integer>> moves;
    String type;
    public Queen(String color, int x_pos, int y_pos){
        this.color=color;
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        type="Knight";
        captured=false;
        moves=new LinkedList<>();
    }

    /**
     * Adjust the current position (x_pos, y_pos) to x_pos1 and y_pos1
     * Check if the move is legal (via isLegal())
     * If legal, updateMoves()
     * if not, return an error.
     * @param x_pos1 x position that the rook moves to
     * @param y_pos1 y position that the rook moves to
     */
    public void move(int x_pos1, int y_pos1){
        //TODO
    }

    /**
     * Checks if  move is legal. For example the rook can't move diagonally.
     * Takes in x_pos and y_pos that are the position its going to move.
     * @param x_pos x position that its going to
     * @param y_pos y position that its going to
     * @return
     */
    public boolean isLegal(int x_pos, int y_pos){
        //TODO
        return false;
    }

    public void updateMoves(Integer x_pos, Integer y_pos){
        moves.add(new ChessPosition(x_pos,y_pos));
    }

    @Override
    public String toString() {
        return color+" "+"Queen";
    }
}
