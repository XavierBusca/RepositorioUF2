// 1. Crea una nova classe en Java per a la implementació de l'arbre binari.
public class BinaryTree {
    private Node root;
    private static int instances = 0;

    // 2. Implementa constructors per a la creació de l'arbre binari.
    public BinaryTree() {
        this.root = null;
        instances++;
    }

    public BinaryTree(Node root) {
        this.root = root;
        instances++;
    }

    // 3. Volem que les instancies d’arbre sapiguen quantes instancies coexisteixen a la vegada.
    public static int getInstances() {
        return instances;
    }

    // 4. Volem poder fer servir dos tipus d’arbres, un d’enters i un altre de caracters.
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