/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
   

           ArrayList<Integer> ans = new ArrayList<>();

           inorder(root, ans);

           return ans;
       }

       public void inorder(Node root, ArrayList<Integer> ans) {

           if (root == null) {
               return;
           }

           // First: Left
           inorder(root.left, ans);

           // Second: Root
           ans.add(root.data);

           // Third: Right
           inorder(root.right, ans);
       }
   }
