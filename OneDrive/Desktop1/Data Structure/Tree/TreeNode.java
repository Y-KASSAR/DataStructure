package Lec18.Tree;
// Scratch; written by Khaled 01/05/2017

import java.util.LinkedList;

public class TreeNode 
{
	private String Element;
	private LinkedList<TreeNode> Children;
	
	public TreeNode (String value)
	{
		Element = value;
		Children = new LinkedList<TreeNode>();
	}

        public String getElement()
	{
		return Element;
	}
	
	public void AddChild(String value)
	{
		TreeNode Child = new TreeNode(value);
		Children.addLast(Child);
	}
	
	public void AddChild(TreeNode Child)
	{
		Children.addLast(Child);
	}
	
	public boolean isLeaf()
	{
		return (Children.size()==0)? true : false;
	}
}