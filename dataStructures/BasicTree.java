package dataStructures;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int d){
		data=d;
	}
}
public class BasicTree {
	TreeNode root;
	
	public BasicTree(){
		root=null;
	}
	void insert(int d){
		TreeNode n=new TreeNode(d);
		if (root==null){
			root=n;
		}
		else if(d<=root.data){
			root.left=n;
			
			n.data=d;
			n.left=null;
			n.right=null;
			
		}
		else if(d>root.data){
			root.right=n;
			n.data=d;
			n.left=null;
			n.right=null;
		}
	}
	void display(){
		TreeNode n=root;
		
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTree t=new BasicTree();
		t.insert(4);
		t.insert(1);
		t.insert(2);
		t.display();
	}

}
