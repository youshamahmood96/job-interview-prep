/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode newH = head.next;
        ListNode store = newH.next;
        newH.next = head;
        head.next = null;
        while(store!=null){
            ListNode nStore = store.next;
            store.next = newH;
            newH = store;
            store = nStore;
        }
        return newH;
    }
}
