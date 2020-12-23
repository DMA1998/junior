package procedural.proc_03;

public class Node<T> {

    public int value;
    public Node<T> next;

    public Node(int value,Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this(value,null);
    }

}
