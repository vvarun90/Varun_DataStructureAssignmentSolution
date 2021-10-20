package com.greatlearning.question2.service;

public class BinarySearchTree {

	public Node root;
	
	Node skewedTreePrevNode = null;
	Node skewedTreeRoot = null;

	public class Node {

		public Node left;
		public Node right;
		public int data;		
	}

	public Node newNode(int data) {

		Node temp = new Node();

		temp.data = data;

		temp.left = null;
		temp.right =null;

		return temp;
	}

	public void GenerateSkewedTree (Node root) {

		if(root == null)
		{
			return;
		}

		GenerateSkewedTree (root.left);

		Node rightNode = root.right;

		if(skewedTreeRoot == null)
		{
			skewedTreeRoot = root;
			skewedTreeRoot.left = null;			
			skewedTreePrevNode = root;
		}
		else
		{
			skewedTreePrevNode.right = root;			
			skewedTreePrevNode.left = null;
			skewedTreePrevNode = root;
		}

		GenerateSkewedTree (rightNode);


	}

	public void DisplaySkewedTree () {

		if(skewedTreeRoot == null)
		{
			return;
		}

		System.out.print(skewedTreeRoot.data + " ");
		skewedTreeRoot = skewedTreeRoot.right;
		DisplaySkewedTree();

	}	

}
