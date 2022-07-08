public class Node<T> {
    public T data;
    public Node next = null;

    public Node(T _data)
    {
        this.data = _data;
        this.next = null;
    }
    public Node(Node old)
    {
        this.data = (T) old.data;
        this.next = old.next;
    }
}