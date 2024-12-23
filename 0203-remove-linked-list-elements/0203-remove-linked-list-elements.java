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
    public ListNode removeElements(ListNode head, int val) {
        ListNode myNode= new ListNode(-1);
        myNode.next= head;
        ListNode current = myNode;

        while(current.next!=null){
            if(current.next.val == val){
                current.next= current.next.next; //remove the node 
            }else{
                current=current.next;
            }
        }
        return myNode.next;
    }
}