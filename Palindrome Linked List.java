/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    } 
    public Node FindMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
        if(head==null || head.next==null){
            return true;
        }
        Node Middle=FindMiddle(head);
        Node SecondHalfStart=reverse(Middle.next);
        Node FirstHalfStart=head;
        while(SecondHalfStart!=null){
            if(FirstHalfStart.data!=SecondHalfStart.data){
                return false;
            }
           FirstHalfStart=FirstHalfStart.next;
             SecondHalfStart= SecondHalfStart.next;
        }
        return true;
    }
}
