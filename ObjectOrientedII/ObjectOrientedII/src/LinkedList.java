public class LinkedList<T> {


    public Node first;

    public LinkedList(T _firstData)
    {
        first = new Node(_firstData);
    }

    public LinkedList()
    {
    }

    public void append(T _data)
    {
        Node nuNode = new Node(_data);
        if(first == null) {
            first = nuNode;
            return;
        }
        // Goes up to last node first
        Node current = first;
        while(current.next != null)
            current = current.next;
        current.next = nuNode;
    }

    public void prepend(T _data)
    {
        Node nuNode = new Node(_data);
        nuNode.next = first;
        first = nuNode;
    }

    public T at(int index)
    {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
            if (current == null)
                throw new ArrayIndexOutOfBoundsException();
        }
        return (T) current.data;
    }

    public void insert(int index, T _data) // Insert by index
    {
        Node nuNode = new Node(_data);
        Node current = first;
        for(int i = 0; i < index-1; i++)
        {
            current = current.next;
            if(current == null)
                throw new ArrayIndexOutOfBoundsException();
        }
        // The `current` var is actually a reference to the Node BEFORE the index
        Node nextNode = new Node(current.next);
        current.next = nuNode;
        (current.next).next = nextNode;

    }

    /*public void insert(T val, T _data) // Insert at the place where this value shows up
    {
        Node nuNode = new Node(_data);
        Node current = first;
        while(current.next != null)
        {
            current = current.next;
        }
        Node
    }*/
}