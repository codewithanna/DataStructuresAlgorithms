public class Main {
    public static void main(String[] args) {

        // PRE ORDER

        TreePreOrderTraversal treePre = new TreePreOrderTraversal();
        treePre.root = new Node(1);
        treePre.root.left = new Node(2);
        treePre.root.right = new Node(3);
        treePre.root.left.left = new Node(4);
        treePre.root.right.right = new Node(5);

        System.out.println(
                "Pre order traversal: "
        );
        treePre.printPreOrder();


        // IN ORDER

        TreeInOrderTraversal treeIn = new TreeInOrderTraversal();
        treeIn.root = new Node(1);
        treeIn.root.left = new Node(2);
        treeIn.root.right = new Node(3);
        treeIn.root.left.left = new Node(4);
        treeIn.root.right.right = new Node(5);

        System.out.println(
                "In order traversal: "
        );

        treeIn.printInOrder();


        // POST ORDER

        TreePostOrderTraversal treePost = new TreePostOrderTraversal();
        treePost.root = new Node(1);
        treePost.root.left = new Node(2);
        treePost.root.right = new Node(3);
        treePost.root.left.left = new Node(4);
        treePost.root.right.right = new Node(5);

        System.out.println(
                "Post order traversal: "
        );

        treePost.printPostOrder();
    }
}