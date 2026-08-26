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
    ListNode findMiddle(ListNode head) {
        ListNode slow = head , fast = head.next;
        while(fast!=null && fast.next != null){
            slow =slow.next ;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode merge2List(ListNode list1 , ListNode list2){
        ListNode dNode = new ListNode(-1);
        ListNode temp = dNode;
        while(list1!=null && list2!= null){
            if(list1.val < list2.val){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if(list1 != null) temp.next = list1;
        else temp.next = list2;

        return dNode.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode lefthead , righthead;
        lefthead = head ; righthead = middle.next;

        middle.next = null ;
        lefthead = sortList(lefthead);
        righthead = sortList(righthead);

        return merge2List(lefthead , righthead);       
    }
}