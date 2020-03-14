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

    /**
     * Adjust the current position (x_pos, y_pos) to x_pos1 and y_pos1
     * Check if the move is legal (via isLegal())
     * If legal, updateMoves()
     * if not, return an error.
     * @param x_pos1 x position that the rook moves to
     * @param y_pos1 y position that the rook moves to
     */
    public void move(int x_pos1, int y_pos1)throws Exception{
        if(isLegal(x_pos1, y_pos1)){

        }
        else throw new Exception("Illegal move");
    }

    /**
     * Checks if  move is legal. For example the rook can't move diagonally.
     * Takes in x_pos and y_pos that are the position its going to move.
     * There are 8 types of moves this knight can make (this method does not account)
     * Left Side Diagonal (up and down), Right side diagonal (up and down),
     * Up and down diagonal (both right and left)
     * @param x_pos x position that its going to
     * @param y_pos y position that its going to
     * @return
     */
    public boolean isLegal(int x_pos, int y_pos)throws Exception{
        ChessPosition<Integer> pos = new ChessPosition<>(x_pos, y_pos);

        boolean left_diagonal=false;
        boolean right_diagonal=false;
        boolean up_diagonal=false;
        boolean down_diagonal=false;

        boolean left_diagonal_up=false;
        boolean left_diagonal_down=false;

            //determining value of left_diagonal

            //determining if pos is left_diagonal_up
            left_diagonal_up=(pos.x+1==this.x_pos)&&(pos.y-2==this.y_pos);
            //left_diagonal_up=(pos.x-2==this.y_pos)&&(pos.y+1==this.y_pos);
            //determining if pos is left_diagonal_down
            left_diagonal_down=(pos.x-1==this.x_pos)&&(pos.y+2==this.y_pos);
            //determine value of left_diagonal
            left_diagonal=left_diagonal_up || left_diagonal_down;

            //determining value of right_diagonal

                //determing value of right_diagonal_up
                //boolean right_diagonal_up=(pos.x+1==this.x_pos)&&(pos.y+2==this.y_pos);
                boolean right_diagonal_up=(pos.x==this.x_pos+2)&&(pos.y==this.y_pos+1);
                //determining value of right_diagonal_down
                //boolean right_diagonal_down=(pos.x-1==this.x_pos)&&(pos.y+2==this.y_pos);
                boolean right_diagonal_down=(pos.x==this.y_pos+2)&&(pos.y==this.y_pos-1);
                right_diagonal=right_diagonal_down||right_diagonal_up;

            //determining value of up_diagonal
            boolean up_diagonal_right=(pos.x==this.x_pos-2)&&(pos.y==this.y_pos+1);
            boolean up_diagonal_left=(pos.x==this.x_pos-2)&&(pos.y==this.y_pos-1);
            up_diagonal=up_diagonal_left||up_diagonal_right;

            //determining value of down_diagonal
            boolean down_diagonal_left=(pos.x==this.x_pos+2)&&(pos.y==this.y_pos-1);
            boolean down_diagonal_right=(pos.x==this.x_pos+2)&&(pos.y==this.y_pos+1);
            down_diagonal=down_diagonal_left||down_diagonal_right;


        //return
        return left_diagonal||right_diagonal||up_diagonal||down_diagonal;
    }

    public void updateMoves(Integer x_pos, Integer y_pos){
        moves.add(new ChessPosition(x_pos,y_pos));
    }

    @Override
    public String toString() {
        return color+" "+"Knight";
    }
}
