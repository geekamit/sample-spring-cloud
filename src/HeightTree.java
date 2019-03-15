public class HeightTree {

    static int heightTree(Node root){
        if (root == null){
            return 0;
        }
        return (1+Math.max(heightTree(root.left), heightTree(root.right)));
    }
}

