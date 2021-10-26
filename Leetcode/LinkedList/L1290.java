package Leetcode.LinkedList;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class L1290 {
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
