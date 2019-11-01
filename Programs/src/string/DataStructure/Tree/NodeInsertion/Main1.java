public class Main1 {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        btree.insert(50);
        btree.insert(45);
        btree.insert(17);
        btree.insert(55);
        btree.insert(65);
        btree.insert(20);
        btree.insert(10);
        btree.insert(34);
        btree.insert(16);
        btree.insert(57);
        btree.insert(68);
        btree.insert(29);
        btree.insert(99);

        btree.printPreOrder();
        System.out.println();
        System.out.println();
        System.out.println();
        btree.printLeaves(btree.root);
        int maxDepth = btree.depth(btree.root);
        System.out.println(maxDepth);

        System.out.println(btree.height(btree.root)-1);
    }
}