
public class BinaryTree {
    private Node root;
    private static int instances = 0;

    public BinaryTree() {
        this.root = null;
        instances++;
    }

    public BinaryTree(Node root) {
        this.root = root;
        instances++;
    }

    public static int getInstances() {
        return instances;
    }

    public static class Node {
        private Object data;
        private Node left;
        private Node right;
        private int maxDepth;

        public Node(Object data, int maxDepth) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.maxDepth = maxDepth;
        }
    }
}