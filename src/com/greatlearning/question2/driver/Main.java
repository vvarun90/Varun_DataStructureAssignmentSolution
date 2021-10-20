package com.greatlearning.question2.driver;

import com.greatlearning.question2.service.BinarySearchTree;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.newNode(50);
		tree.root.left = tree.newNode(30);
		tree.root.right = tree.newNode(60);
		tree.root.left.left = tree.newNode(10);
		tree.root.right.left= tree.newNode(55);

		tree.GenerateSkewedTree(tree.root);

		tree.DisplaySkewedTree();

	}

}