package datastructure.tree.practice1;

public class BinaryTree {
	Node root;
	
	public void addNode(int key, String name) {
		Node new_Node = new Node(key, name);
		if(root == null) {
			root = new_Node;
		}
		else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					
					if(focusNode == null) {
						parent.leftChild = new_Node;
						return;
					}
				}
				else {
					focusNode = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = new_Node;
						return;
					}
				}
			}
		}
		
		
	}
	public void showBinaryTree(Node focusNode) {
		if(focusNode != null) {
			
			showBinaryTree(focusNode.leftChild);
			System.out.println(focusNode);
			showBinaryTree(focusNode.rightChild);
		}
	}
}
