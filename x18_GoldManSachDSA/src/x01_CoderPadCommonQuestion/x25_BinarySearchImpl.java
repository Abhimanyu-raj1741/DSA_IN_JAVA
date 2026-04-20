package x01_CoderPadCommonQuestion;

public class x25_BinarySearchImpl { 
	
	 class Node {
		  int value;
		  Node left;
		  Node right;
		  
		  public Node(int value) {
			     this.value=value;
			     left=right=null;
		  }
	 }
		Node root; 
		
		public void insert(int value) {
			 root = insertRec(root,value);
		}
		public Node insertRec(Node root, int value ) {
			 if(root==null) { 
				 return new Node(value);
			 }
			 if(value<root.value) {
				 root.left = insertRec(root.left,value);
				 
			 }else if (value>root.value) {
				 root.right = insertRec(root.right,value);
			 }
			return root;
		}
		public void inOrderTraversal() {
			inOrderRec(root);
		}
		public void inOrderRec(Node root) {
			if(root!=null) {
				System.out.println(root.value);
				inOrderRec(root.left);
				
				inOrderRec(root.right);
			}
			 
		}
		  
	 
	 public static void main(String[] args) {
		   x25_BinarySearchImpl bst = new x25_BinarySearchImpl();
		   bst.insert(50);
		   bst.insert(30);
		   bst.insert(40);
		   bst.insert(20);
		   bst.inOrderTraversal();
	}

}
