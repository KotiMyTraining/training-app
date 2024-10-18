package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversingProb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root=new Tree(2);
		root.left=new Tree(3);
		root.Right=new Tree(4);
		root.left.left=new Tree(5);
		root.left.Right=new Tree(6);
		root.Right.left=new Tree(7);
		
		//inOrderTraversal(root);
		//preorderTraversal(root);
		//postorderTraversal(root);
		// level by level
		levelorderTraversal(root);
		

	}
	
	private static void levelorderTraversal(Tree root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
		   return;
		}
		
		Queue<Tree> queue= new LinkedList<Tree>();
	     queue.add(root);
	     
	     while(!queue.isEmpty())
	     {
	    	 Tree currentNode=queue.poll();
	 		System.out.print(currentNode.data);
	 		
	 		if(currentNode.left!=null)
	 	    {
	 			queue.add(currentNode.left);
	 			//System.out.print(currentNode.left.data);
	 		}
	 	     if(currentNode.Right!=null)
	 	    {
	 	    	queue.add(currentNode.Right);

	 			//System.out.print(currentNode.Right.data);
	 		}
	     }
		
		
		
	}

	private static void postorderTraversal(Tree root) {
		// TODO Auto-generated method stub
		
		//preorder root,left,right traversal 
				if(root==null)
				{
				   return;
				}else {
					inOrderTraversal(root.left);
					
					inOrderTraversal(root.Right);
					System.out.print(root.data);

				}
		
	}


	private static void preorderTraversal(Tree root) {
		// TODO Auto-generated method stub
		
		//preorder root,left,right traversal 
				if(root==null)
				{
				   return;
				}else {
					System.out.print(root.data);
					inOrderTraversal(root.left);
					
					inOrderTraversal(root.Right);
				}
		
	}

	private static void inOrderTraversal(Tree root) {
		// TODO Auto-generated method stub
		//inorder traversal left,root ,right
		if(root==null)
		{
		   return;
		}else {
			inOrderTraversal(root.left);
			System.out.print(root.data);
			inOrderTraversal(root.Right);
		}
		
	}

}
