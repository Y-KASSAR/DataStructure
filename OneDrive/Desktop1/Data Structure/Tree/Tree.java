package Lec18.Tree;
//Scratch; written by Khaled 01/05/2017

public class Tree 
{
	private TreeNode Root;
	
	public Tree()
	{
		Root = null;
	}
	
	public Tree(TreeNode Root)
	{
		this.Root = Root;
	}
	
	public Tree(String value)
	{
		this.Root = new TreeNode(value);
	}

	public TreeNode getRoot()
	{
		return Root;
	}
}
