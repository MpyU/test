package test6;

import java.util.ArrayList;

public class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	
	public static void main(String[] args) {
		
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        
		if(root == null) {
			return null;
		}
		
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(root.val);
		outer.add(arrayList);
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		while(left != null || right != null) {
			ArrayList<Integer> inner2 = new ArrayList<Integer>();
			if(left != null) {
				inner2.add(left.val);
			}
			if(right != null) {
				inner2.add(right.val);
			}
			outer.add(inner2);
		}
		
        
        return null;
    }
	
	public void list(TreeNode root) {
		
	}
	
}
