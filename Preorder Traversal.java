/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
       

                   ArrayList<Integer> ans = new ArrayList<>();

                   preorder(root, ans);

                   return ans;
               }

               public void preorder(Node root, ArrayList<Integer> ans) {

                   if (root == null) {
                       return;
                   }

                   // First: Left
                   ans.add(root.data);

                   // Second: Root
                   preorder(root.left,ans);

                   // Third: Right
                   preorder(root.right, ans);
               }
           }
