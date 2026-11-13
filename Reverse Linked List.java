/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prevNode=null;
        Node currNode=head;
                while(currNode!=null){
                    Node nextNode=currNode.next;
                    currNode.next=prevNode;
                    prevNode=currNode;
                    currNode=nextNode;
                }
                return prevNode;
            }
        }
