package com.tree;

/*LinkedList traversal*/

class Node{
	int key;
	Node left, right;
	
	public Node(int item){
		key = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	void printPreorder(){
		printPreorder(root);
	}
	
	private void printPreorder(Node node) {
		if(node == null){
			return;
		}
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
		
	}
	

	void printInorder(){
		printInorder(root);
	}
	
	private void printInorder(Node node) {
		if(node == null){
			return;
		}
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}

	void printPostorder(){
		printPostorder(root);
	}
	
	private void printPostorder(Node node) {
		if(node == null){
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");

	}
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("InOrder Traversal : ");
		tree.printInorder();
		System.out.println("");
		System.out.println("PreOrder Traversal");
		tree.printPreorder();
		System.out.println("");
		System.out.println("PostOrder Traversal");
		tree.printPostorder();
	}

}
