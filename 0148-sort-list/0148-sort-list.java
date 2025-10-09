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
    public ListNode findMiddle(ListNode head){
        if(head==null||head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null){
            return prev;
        }

        return slow;
        
    }

    public ListNode mergeSort(ListNode h1,ListNode h2){
        if(h1==null){
            return h2;
        }
        if(h2==null){
            return h1;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;

        while(h1!=null&&h2!=null){
            if(h1.val<h2.val){
                // ListNode nn=new ListNode(h1.val);
                curr.next=h1;
                curr=curr.next;
                h1=h1.next;
            }
            else{
                // ListNode nn=new ListNode(h2.val);
                curr.next=h2;
                curr=curr.next;
                h2=h2.next;
            }
        }
        if(h1!=null){
            curr.next=h1;
        }
        if(h2!=null){
            curr.next=h2;
        }
        return dummy.next;
    }

    public ListNode divideAndConquere(ListNode head){
        if(head==null||head.next==null){
            return head;
        }

        ListNode mid=findMiddle(head);
        ListNode r=mid.next;
        mid.next=null;

        ListNode h1=divideAndConquere(head);
        ListNode h2=divideAndConquere(r);
        return mergeSort(h1,h2);
    }

    public ListNode sortList(ListNode head) {
        return divideAndConquere(head);

    }
}