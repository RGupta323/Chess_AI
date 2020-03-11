import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    T data;
    List<Node<T>> children;

    public Node(T data){
        this.data=data;
        children=new LinkedList<>();
    }


}
