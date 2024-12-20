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
    public boolean isPalindrome(ListNode head) {
        int val=0;
          ListNode  slow=head;
          ListNode  fast=head;
           while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
           }
             ListNode pre = null;
             while(slow != null){
                ListNode temp = slow.next;
                slow.next = pre;
                pre = slow ;
                slow = temp;
             }
             ListNode left =head;
             ListNode  right = pre ;
             while(right != null){
                if(left.val != right.val){
                    return false ;

                }
                left =left.next;
                right=right.next;
             }
           return true ;
    }
}