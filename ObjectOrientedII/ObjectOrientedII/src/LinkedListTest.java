public class LinkedListTest {
    public static <T> void printList(LinkedList<T> ll)
    {
        Node current = ll.first;
        for(int i = 0; current != null; current = current.next, i++)
        {
            System.out.println(i + ": " + current.data);
        }
    }
    public static void start()
    {
        LinkedList<String> llCoolJ = new LinkedList();
        for(int i = 0; i < 20; i++)
        {
            llCoolJ.append("STR" + i);
        }
        printList(llCoolJ);

        llCoolJ.insert(8, "New thing at position 8");
        printList(llCoolJ);
    }
}
