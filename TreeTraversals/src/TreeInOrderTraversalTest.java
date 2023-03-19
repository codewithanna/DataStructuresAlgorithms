import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TreeInOrderTraversalTest {

    /*

    SMALL TREE
        1
       / \
      2   3
     /     \
    4       5

    LEFT, ROOT, RIGHT:
    4, 2, 1, 3, 5

    LARGE TREE

                1
               /  \
              /    \
             /      \
            /        \
           2          3
         /   \      /   \
        4     5     6    5
       / \  / \   / \   / \
      7  8 9  10 11 12 13 14

    LEFT, ROOT, RIGHT:
    7, 4, 8, 2, 9, 5, 10, 1, 11, 6, 12, 3, 13, 5, 14

    */

    ArrayList<Integer> resultSmallTree = new ArrayList<>(Arrays.asList(4, 2, 1, 3, 5));
    TreeInOrderTraversal treeSmall = new TreeInOrderTraversal();
    ArrayList<Integer> resultLargeTree = new ArrayList<>(Arrays.asList( 7, 4, 8, 2, 9, 5, 10, 1, 11, 6, 12, 3, 13, 5, 14));
    TreeInOrderTraversal treeLarge = new TreeInOrderTraversal();

    @Before
    public void setUpTrees() {

        // CREATE SMALL TREE
        treeSmall.root = new Node(1);
        treeSmall.root.left = new Node(2);
        treeSmall.root.right = new Node(3);
        treeSmall.root.left.left = new Node(4);
        treeSmall.root.right.right = new Node(5);

        // CREATE LARGE TREE
        // Create the root node
        treeLarge.root = new Node(1);

        // Create the left subtree
        treeLarge.root.left = new Node(2);
        treeLarge.root.left.left = new Node(4); //2
        treeLarge.root.left.left.left = new Node(7); //1
        treeLarge.root.left.left.right = new Node(8); //3
        treeLarge.root.left.right = new Node(5);
        treeLarge.root.left.right.left = new Node(9);
        treeLarge.root.left.right.right = new Node(10);

        // Create the right subtree
        treeLarge.root.right = new Node(3);
        treeLarge.root.right.left = new Node(6);
        treeLarge.root.right.left.left = new Node(11);
        treeLarge.root.right.left.right = new Node(12);
        treeLarge.root.right.right = new Node(5);
        treeLarge.root.right.right.left = new Node(13);
        treeLarge.root.right.right.right = new Node(14);
    }

    @Test
    public void inOrderTraverseSmallTreeTest() {
    assertEquals(resultSmallTree.toString(), treeSmall.printInOrder().toString());
    }

    @Test
    public void inOrderTraverseLargeTreeTest() {
    assertEquals(resultLargeTree, treeLarge.printInOrder());
    }

}