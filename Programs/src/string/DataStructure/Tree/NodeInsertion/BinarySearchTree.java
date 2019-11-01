public class BinarySearchTree {
    Node root;
/*
    public void insert(int key) {
       
        Node new_node = new Node(key);
        
        if(root == null) {
            root = new_node;
        } else {
            Node focusNode = root;
            Node parent;
            while(true) {
                parent = focusNode;
                if(key > focusNode.key) {
                    focusNode = focusNode.right;
                    if(focusNode == null) {
                        parent.right = new_node;
                        return;
                    }
                } else{
                    focusNode = focusNode.left;
                    if(focusNode == null) {
                        parent.left = new_node;
                        return;
                    }
                }
                
            }
            
        }
     


    }
    */
    public void insert(int key) {
        root = insertNode(root, key);
    }
    public Node insertNode(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }
        if(key > root.key) {
            root.right = insertNode(root.right, key);
        } else if(key < root.key) {
            root.left = insertNode(root.left, key);
        }
        return root;
    }
    
    public void printPreOrder() {
        preeOrder(root);
    }
    public void preeOrder(Node focusNode) {
        if(focusNode != null) {
            
            preeOrder(focusNode.left);

            System.out.print(focusNode.key+ " ");
            preeOrder(focusNode.right);
        }
    }
    public void printLeaves(Node node) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            System.out.print(node.key + " "); 
        }
        if(node.left != null) {
            printLeaves(node.left);
        } 
        if(node.right != null) {
            printLeaves(node.right);
        }
    }

    public int depth(Node node) {
        if(node == null) {
            return 0;
        }else {
            int leftDepth = depth(node.left);
            int rightDepth  = depth(node.right);
            if(leftDepth > rightDepth) {
                return leftDepth;
            } else {
                return rightDepth;
            }
        }
        
    }
    public static int height(Node root) {
        // Write your code here.
        if(root== null) {
            return 0;
        } else {
            int lDepth = height(root.left);
            int rDepth = height(root.right);
            if(lDepth > rDepth) {

                return (lDepth+1);
            } else {
                return (rDepth+1);
            }
        }
  }

}