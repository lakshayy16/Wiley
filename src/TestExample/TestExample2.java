package TestExample;

import java.util.HashMap;

//class to create nodes
class Node {
int key;
Node left, right;

public Node(int item) {
key = item;
left = right = null;
}
}

public class TestExample2 {
static Node root;
static HashMap <Node,Integer> dp;
// Traverse tree
public static void traverseTree(Node node) {
 if (node != null) {
   traverseTree(node.left);
   System.out.print(" " + node.key);
   traverseTree(node.right);
 }
}

public static int recTree(Node node) {
	
	if(node==null)
		return 0;
	if(dp.containsKey(node))
		return dp.get(node);
	int incl=node.key;
	
	// Calculating sum of exterior and interior nodes 
	int excl= recTree(node.left)+recTree(node.right);
	System.out.print(incl+"||"+excl+"      ");
	if(node.left!=null)
	{
	incl+= recTree(node.left.left);
	incl+= recTree(node.left.right);
	}
	if(node.right!=null)
	{
	incl+= recTree(node.right.left);
	incl+= recTree(node.right.right);
	}
	dp.put(node, Math.max(incl,excl));
	return dp.get(node);
}

public static void main(String[] args) {

dp = new HashMap<>();
 // create nodes of the tree
 Node root = new Node(1);
 root.left = new Node(2);
 root.right = new Node(3);
 root.left.left = new Node(4);
 root.left.right = new Node(5);
 root.right.left = new Node(6);
 root.right.right = new Node(7);
// root.right.right.left = new Node(50);


 System.out.print("\nBinary Tree: ");
 traverseTree(root);
 System.out.println();
 long start = System.nanoTime();
 System.out.println(recTree(root));
 long end = System.nanoTime();
 System.out.println("Time taken :" + (end-start));
// 			 1
// 		  2     3
// 	    4  5   6  7
}
}

