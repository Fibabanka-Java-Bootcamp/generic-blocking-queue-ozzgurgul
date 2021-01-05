
public class Node<T> {

    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;

    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;

    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return the nextNode
     */
    public Node<T> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
