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
    public ListNode middleNode(ListNode head) {
         ListNode current = head;
         int l = 0;
         while(current != null){
              current = current.next;
              l++;
         }
         int s = l/2;
         current = head;
         int i = 0;
         while(i != s){
             i++;
             current = current.next;
         }
         head = current;
         return head;
    }
}