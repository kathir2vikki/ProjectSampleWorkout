package DSA.LinkedList;

public class LinkedList {


    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList linkedList, int data)
    {
        Node new_node = new Node(data);

        if(linkedList.head == null)
        {
            linkedList.head = new_node;
        }

        else {
            Node last = linkedList.head;
            while (last.next != null) {
                    last = last.next;
            }
            last.next = new_node;
        }
        return linkedList;
    }

    public static void printList(LinkedList linkedList)

    {
        Node currentNode = linkedList.head;

        while(currentNode!=null)
        {
            System.out.println("print list " + currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public static LinkedList delete(LinkedList linkedList, int data)
    {
        if(linkedList.head != null && linkedList.head.data == data)
        {
            linkedList.head = linkedList.head.next;
        }

        Node currentNode = linkedList.head;
        Node prev = null;

        while(currentNode !=null && currentNode.data != data)

        {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if(currentNode !=null)
        {
            prev.next = currentNode.next;
        }

        return linkedList;
    }

    public static LinkedList deleteByindex(LinkedList linkedList, int index)
    {
        Node currentNode = linkedList.head, prev = null;

        if(currentNode != null && index == 0)
        {
            linkedList.head = currentNode.next;
            return linkedList;
        }

        int counter = 0;

        while(currentNode!=null)
        {
            if (counter == index)
            {
                prev.next = currentNode.next;
                break;
            }

            else {
                prev = currentNode;
                currentNode = currentNode.next;
                counter ++;

            }
        }

        return linkedList;



    }






    public static void main(String[] ar)
    {

        LinkedList linkedList = new LinkedList();

        linkedList = insert(linkedList,1);
        linkedList = insert(linkedList,4);
        linkedList = insert(linkedList,2);
        linkedList = insert(linkedList,4);
        printList(linkedList);

        linkedList = delete(linkedList,4);

        printList(linkedList);

        /*linkedList = deleteByindex(linkedList,1);

        printList(linkedList);*/

    }
}
