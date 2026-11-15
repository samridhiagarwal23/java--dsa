/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
       


                           ArrayList<Integer> ans = new ArrayList<>();

                           postorder(root, ans);

                           return ans;
                       }

                       public void postorder(Node root, ArrayList<Integer> ans) {

                           if (root == null) {
                               return;
                           }

                           // First: Left
                           postorder(root.left,ans);
                           postorder(root.right, ans);
                           ans.add(root.data);

                          
                       }
                   }
