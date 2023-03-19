import java.util.Stack;

public class TreeInOrderTraversal {

    // LEFT, ROOT, RIGHT

    Node root;

    Stack<Integer> s = new Stack<>();

    TreeInOrderTraversal() { root = null; }

    public void treeInOrderTraversal(Node node) {
        if(node == null){ return; }

        treeInOrderTraversal(node.left);
        s.push(node.key);
        treeInOrderTraversal(node.right);
    }

    Stack<Integer> printInOrder() {
        treeInOrderTraversal(root);
        System.out.println(s);
        return s;
    }
}
