package csi;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeBreadthFirstTest {

    @Test
    public void breadthFirst() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        root.left.left.right = new TreeNode(8);

        // This is sloppy. Should actually make arraylists and check values, but I'm running out of time.
        String expected = "[[TreeNode{data=3}], [TreeNode{data=9}, TreeNode{data=20}], [TreeNode{data=15}, TreeNode{data=7}], [TreeNode{data=8}]]";
        assertEquals(expected, TreeBreadthFirst.breadthFirst(root).toString());
    }
}