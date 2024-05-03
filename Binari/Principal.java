public class Principal {
    public static void main(String[] args) {
        BinaryTree.Node root1 = new BinaryTree.Node(1, 5);
        BinaryTree tree1 = new BinaryTree(root1);

        BinaryTree.Node root2 = new BinaryTree.Node(2, 5);
        BinaryTree tree2 = new BinaryTree(root2);

        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        BinaryTree.Node root3 = new BinaryTree.Node('A', 3);
        BinaryTree tree3 = new BinaryTree(root3);

        BinaryTree.Node root4 = new BinaryTree.Node('B', 3);
        BinaryTree tree4 = new BinaryTree(root4);

        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        System.gc();

        traverseRightBranch(tree1.getRoot());

        traverseLeftBranch(tree2.getRoot());

        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        System.gc();

        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");
    }

    public static void traverseRightBranch(BinaryTree.Node node) {
        if (node != null) {
            traverseRightBranch(node.getRight());
            System.out.println(node.getData());
        }
    }

    public static void traverseLeftBranch(BinaryTree.Node node) {
        if (node != null) {
            traverseLeftBranch(node.getLeft());
            System.out.println(node.getData());
        }
    }
}