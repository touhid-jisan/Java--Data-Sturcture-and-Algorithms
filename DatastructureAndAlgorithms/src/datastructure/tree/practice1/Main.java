package datastructure.tree.practice1;

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(1, "jisan");
		tree.addNode(15, "jisan");
		tree.addNode(17, "jisan");
		tree.addNode(21, "jisan");
		tree.addNode(134, "jisan");
		tree.addNode(14, "jiafasan");
		tree.addNode(17, "jisan");
		
		tree.showBinaryTree(tree.root);
	}
}
