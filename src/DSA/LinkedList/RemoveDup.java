package DSA.LinkedList;

import java.util.HashSet;
class ListNode {

    int val;
    ListNode next;

    ListNode(int val){
        this.val= val;
        this.next=null;
    }

}

public class RemoveDup{
    public ListNode delDupl(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        HashSet<Integer> set = new HashSet<>();
       // set.add(head.val);

        ListNode cur = head;
        ListNode prv = head;

        while(cur != null && cur.next!=null)
        {
            if(set.contains(cur.next.val))
            {
                prv.next = cur.next.next;
            }
            else
            {
                set.add(cur.next.val);
                prv = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public void print(ListNode head)
    {
        ListNode cur = head;
        while(cur!=null)
        {
            System.out.println(cur.val);
            if(cur.next!=null)
            {
                System.out.println(", ");
            }
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] arg)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        RemoveDup solu = new RemoveDup();
        solu.print(head);

        head = solu.delDupl(head);

        solu.print(head);
    }
}
