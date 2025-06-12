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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode list = new ListNode();
            ListNode current = list;
            int carry = 0;
            while(l1 != null && l2 != null){
                int sum = carry + l1.val+l2.val;
                current.next = new ListNode(sum%10);
                carry = sum/10;
                current = current.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            while(l1 != null){
                int sum = carry+l1.val;
                current.next = new ListNode(sum%10);
                carry = sum/10;
                l1 = l1.next;
                current = current.next;
            }
            while(l2 != null){
                int sum = carry+l2.val;
                current.next = new ListNode(sum%10);
                carry = sum/10;
                l2 = l2.next;
                current = current.next;
            }
            if(carry != 0) current.next = new ListNode(carry);
            return list.next;
    }
}