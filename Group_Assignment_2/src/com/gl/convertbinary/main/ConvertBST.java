/**
 * @author Rohan Chakraborty, Lalita Choudhury, PushPendra Trivedi
 * 	Other Group Member: Tanya Sharma, Abhishek Shah
 */
package com.gl.convertbinary.main;

public class ConvertBST {
	public Node node;
	static Node prevNode = null;
	static Node headNode = null;

	public static void main(String[] args) {
		ConvertBST tree = new ConvertBST();
		tree.node = new Node(50);
		tree.node.leftNode = new Node(30);
		tree.node.rightNode = new Node(60);
		tree.node.leftNode.leftNode = new Node(10);
		tree.node.rightNode.leftNode = new Node(55);
		int order = 0;
		convertToSkewed(tree.node, order);
		printTree(headNode);

	}

	private static void printTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		printTree(root.rightNode);

	}

	private static void convertToSkewed(Node root, int order) {
		if (root == null)
			return;
		// traversing through the left hand side of the root to find the lowest node
		if (order > 0)
			convertToSkewed(root.rightNode, order);
		else
			convertToSkewed(root.leftNode, order);
		Node rightNode = root.rightNode;
		Node leftNode = root.leftNode;
		// Checking if head node/root node for skewed tree is null or not
		// if null fill it with the lowest value
		if (headNode == null) {
			headNode = root;
			root.leftNode = null;
			prevNode = root;
		} else {
			prevNode.rightNode = root;
			root.leftNode = null;
			prevNode = root;
		}

		if (order > 0)
			convertToSkewed(leftNode, order);
		else
			convertToSkewed(rightNode, order);
	}

}
