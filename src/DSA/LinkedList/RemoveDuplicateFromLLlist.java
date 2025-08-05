package DSA.LinkedList;


import java.util.HashSet;
import java.util.Iterator;

class LisNode
{
    int data;
    LisNode next;

    LisNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class RemoveDuplicateFromLLlist {


    static LisNode print(LisNode head)
    {
        if(head ==null && head.next!=null)
        {
            return head;
        }

        LisNode current = head;

        /*while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }*/
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> hsList = new HashSet<>();
        while(current!=null)
        {
            if(!hsList.contains(current.data))
            {
                sb.append(current.data);
                System.out.println("sb builder ===== " + sb.toString());
                hsList.add(current.data);
                System.out.println("current datat ====" + current.data);
            }
            current = current.next;
        }

        return head;
    }


    static LisNode checkDuplicateNode(LisNode node)
    {
        LisNode current = node;

        LisNode prev = null;

        HashSet<Integer> hs = new HashSet<>();

        while(current != null)
        {
            if(hs.contains(current.data))
            {
                prev.next = current.next;
            }

            else {
                hs.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return node;
    }




    public static void main(String[] arg)
    {
        LisNode listNode = new LisNode(1);
        listNode.next = new LisNode(2);
        listNode.next.next = new LisNode(2);
        listNode.next.next.next = new LisNode(3);

        RemoveDuplicateFromLLlist.checkDuplicateNode(listNode);
        RemoveDuplicateFromLLlist.print(listNode);
    }
}
