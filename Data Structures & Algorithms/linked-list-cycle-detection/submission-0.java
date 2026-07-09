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
    public boolean hasCycle(ListNode head) {
        ListNode slowp = head;
        ListNode fastp = head;

        while(fastp != null && fastp.next != null){
             slowp = slowp.next;
             fastp = fastp.next.next;

               if(slowp == fastp) {return true ;}
        }

      return false;
    }
}
