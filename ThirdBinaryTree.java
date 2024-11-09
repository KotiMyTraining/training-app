package com.internalEvolution;

public class ThirdBinaryTree {
	
	Tree root;
	
	public static void main(String... args)
	{
		ThirdBinaryTree binaryTree=new ThirdBinaryTree();
		
		binaryTree.root=new Tree(1);
		binaryTree.root.left=new Tree(2);
		binaryTree.root.right=new Tree(3);
		
		binaryTree.root.left.left=new Tree(4);
		
		binaryTree.root.left.right=new Tree(5);

		binaryTree.root.right.left=new Tree(4);
		
		binaryTree.root.right.right=new Tree(5);
		
		inOrderTraversal(binaryTree.root);
		
		
		
	}

	private static void inOrderTraversal(Tree root) {
		
		if (root==null)
		{
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data);
		inOrderTraversal(root.right);
		
		
	}

}
