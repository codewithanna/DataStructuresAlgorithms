import java.util.Stack;

public class TreePostOrderTraversal {

    // LEFT, RIGHT, ROOT

    Node root;

    Stack<Integer> s = new Stack<>();

    TreePostOrderTraversal() { root = null; }

    public void treePostOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        treePostOrderTraversal(node.left);
        treePostOrderTraversal(node.right);
        s.push(node.key);
    }

    Stack<Integer> printPostOrder() {
        treePostOrderTraversal(root);
        System.out.println(s);
        return s;
    }
}
