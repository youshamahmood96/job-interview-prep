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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        HashSet<Integer> set = new HashSet<>();
        ListNode curr = head;
        while(curr!=null){
            if(!set.contains(curr.val)){
                set.add(curr.val);
            }
            curr = curr.next;
        }
        int n = set.size();
        Integer arr[] = new Integer[n];
        int i = 0;
        for (Integer x : set)
            arr[i++] = x;
        Arrays.sort(arr);
        ListNode res = new ListNode();
        res.val = arr[0];
        curr = res;
        res.next = new ListNode();
        res = res.next;
        for(int j = 1; j<arr.length;j++){
            res.val = arr[j];
            res.next = new ListNode();
            res = res.next;
        }
        res.next = null;
        res = curr;
        while(res.next!=null){
            if(res.next.next == null){
                res.next = null;
                break;
            }
            res = res.next;
        }
        return curr;
    }
}
