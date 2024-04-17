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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return true;
        }
        if(head.next.next == null){
            if(head.val!=head.next.val){
                return false;
            }
            else{
                return true;
            }
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        while(slow!=null){
            if(slow.val!=head.val){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
