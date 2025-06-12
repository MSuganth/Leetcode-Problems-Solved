/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
           Set<ListNode> set = new HashSet<>();
           ListNode current = head;
           while(current != null){
                if(!set.add(current)) return current;
                set.add(current);
                current = current.next;
           }
           return null;
    }
}