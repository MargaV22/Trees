class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    void printPostorder(Node node) {
        if (node != null) {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void printPreorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal");
        tree.printPreorder(tree.root);
        System.out.println("\nInorder traversal");
        tree.printInorder(tree.root);
        System.out.println("\nPostorder traversal");
        tree.printPostorder(tree.root);

    }
}
