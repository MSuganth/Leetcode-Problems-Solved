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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           ListNode cur = head;
           int l = 0;
           while(cur != null){
               cur = cur.next;
               l++;
           }
           int d = l-n;
           if(d == 0){
              head = head.next;
              return head;
           }
           int i = 0;
           cur = head;
           ListNode prev = null;
           while(i != d){
                 prev = cur;
                 cur = cur.next;
                 i++;
           }
           prev.next = cur.next;
           return head;
    }
}