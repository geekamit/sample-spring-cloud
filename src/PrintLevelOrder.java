import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrder {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printOrderLevelRecursive(root);
    }

    static void printOrderLevel(Node root){
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while (true) {

            int nodeCount = queue.size();
            if (nodeCount == 0) break;

            while (nodeCount > 0) {
                Node nextNode = queue.peek();
                System.out.print(nextNode.data +" ");
                queue.remove();

                if (nextNode.left != null) {
                    queue.add(nextNode.left);
                }
                if (nextNode.right != null) {
                    queue.add(nextNode.right);
                }
                nodeCount--;
            }
            System.out.println();
        }
    }

    public static void printOrderLevelRecursive(Node root){
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if (temp != null)
                System.out.print(temp.data+" ");

            if (temp == null){
                System.out.println();

                if (!queue.isEmpty())
                    queue.add(null);
            }

            if (temp != null && temp.left != null){
                queue.add(temp.left);
            }
            if (temp != null && temp.right != null){
                queue.add(temp.right);
            }



        }

    }

}


