/*
剑指 Offer 06 从尾到头打印链表


*/


import java.util.LinkedList;

class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }


public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        System.out.println("剑指 Offer 06 从尾到头打印链表");
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
        return res;


    }
}
