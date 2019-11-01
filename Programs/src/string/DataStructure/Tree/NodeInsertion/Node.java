public class Node {
    int key;
    Node left;
    Node right;
    public Node(int key) {
        this.key = key;
    }
    public String toString() {
        return key+"\n";
    }
}