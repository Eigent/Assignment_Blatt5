public class Node {
    Object data;
    Node previous;
    Node following;

    Node (Node previous, Node following, Object data){
        this.data = data;
        this.previous = previous;
        this.following = following;
    }
}