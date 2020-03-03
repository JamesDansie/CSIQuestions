package csi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeBreadthFirst {
    public static ArrayList<ArrayList<TreeNode>> breadthFirst(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<TreeNode>> answer = new ArrayList<>();
        int depth = 0;

        if(root != null) {
            TreeNode newLevel = new TreeNode(0);
            newLevel.newRow = true;

            queue.add(root);
            // adding a dummy node at the end of the row to mark the end of the row
            queue.add(newLevel);

            answer.add(new ArrayList<TreeNode>());
        } else {
            return null;
        }


        while(!queue.isEmpty()) {
            TreeNode tmp = queue.remove();

            // typical breadth first
            if(tmp.left != null) {
                queue.add(tmp.left);
            }
            if(tmp.right != null) {
                queue.add(tmp.right);
            }

            if(tmp.newRow == false) {
                answer.get(depth).add(tmp);
            }
            // checking for the end of the row
            if(tmp.newRow == true) {
                // if there's no more nodes to process, then end the while loop
                if(queue.isEmpty()) {
                    break;
                } else {
                    // add a new row, and add another dummy node to mark the end of the next row
                    depth++;
                    answer.add(new ArrayList<TreeNode>());
                    TreeNode newLevel = new TreeNode(0);
                    newLevel.newRow = true;

                    queue.add(newLevel);
                }
            }
        }
        return answer;
    }
}
