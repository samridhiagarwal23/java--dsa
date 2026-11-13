/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here

              Node newNode = new Node(x);

              if (head == null) {
                  return newNode;
              }

              Node currNode = head;

              while (currNode.next != null) {
                  currNode = currNode.next;
              }

              currNode.next = newNode;

              return head;
          }
      }
