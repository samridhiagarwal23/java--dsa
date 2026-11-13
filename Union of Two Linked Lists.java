/* Linked List Node Structure
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}*/

        // code her
        import java.util.*;

        class Solution {
            public static Node makeUnion(Node head1, Node head2) {

                HashSet<Integer> set = new HashSet<>();

                Node ans = null;
                Node tail = null;

                Node temp1 = head1;
                Node temp2 = head2;

                // First Linked List
                while (temp1 != null) {

                    if (set.add(temp1.data)) {

                        Node newNode = new Node(temp1.data);

                        if (ans == null) {
                            ans = newNode;
                            tail = newNode;
                        }
                        else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    }

                    temp1 = temp1.next;
                }

                // Second Linked List
                while (temp2 != null) {

                    if (set.add(temp2.data)) {

                        Node newNode = new Node(temp2.data);

                        if (ans == null) {
                            ans = newNode;
                            tail = newNode;
                        }
                        else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    }

                    temp2 = temp2.next;
                }

                return ans;
            }
        }
