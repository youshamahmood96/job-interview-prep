package Leetcode.LinkedList;

import java.util.LinkedList;

public class L876 {
    public int getDecimalValue(ListNode head) {
        LinkedList<Integer> ll = new LinkedList<>();
        String num = new String();
        ListNode curr = head;
        while(curr!=null){
            num = num + Integer.toString(curr.val);
            curr = curr.next;
        }
        System.out.println(num);
        return Integer.parseInt(num,2);
    }
}
