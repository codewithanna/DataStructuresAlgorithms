import java.util.Stack;

public class TreePreOrderTraversal {

    // ROOT, LEFT, RIGHT

    Node root;
    Stack<Integer> s = new Stack<>();

    TreePreOrderTraversal() { root = null;}

    public void treePreOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        s.push(node.key);
        treePreOrderTraversal(node.left);
        treePreOrderTraversal(node.right);
    }

    Stack<Integer> printPreOrder() {
        treePreOrderTraversal(root);
        System.out.println(s);
        return s;
    }
}
