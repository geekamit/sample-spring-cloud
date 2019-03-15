import java.util.Stack;

public class BinaryTreeIterative {
    Node root;
    void inOrder(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr !=null && stack.size() > 0){
            System.out.println(curr.data);

            while (curr != null){

            }
        }
    }
}
