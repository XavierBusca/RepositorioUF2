public class Principal {
    public static void main(String[] args) {
        // A. Crear 2 Arbres d’enters de fondaria 5.
        BinaryTree.Node root1 = new BinaryTree.Node(1, 5);
        BinaryTree tree1 = new BinaryTree(root1);

        BinaryTree.Node root2 = new BinaryTree.Node(2, 5);
        BinaryTree tree2 = new BinaryTree(root2);

        // B. Mostrar quantes instancies existeixen d‘arbres.
        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        // C. Crear 2 Arbres de caràcters de fondaria 3.
        BinaryTree.Node root3 = new BinaryTree.Node('A', 3);
        BinaryTree tree3 = new BinaryTree(root3);

        BinaryTree.Node root4 = new BinaryTree.Node('B', 3);
        BinaryTree tree4 = new BinaryTree(root4);

        // D. Mostrar quantes instancies existeixen d’arbres.
        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        // E. Forçar al Garbage Collector.
        System.gc();

        // F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
        traverseRightBranch(tree1.getRoot());

        // G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
        traverseLeftBranch(tree2.getRoot());

        // H. Tornar a mostrar quantes instancies existeixen.
        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");

        // I. Tornar a forçar al Garbage Collector.
        System.gc();

        // J. Tornar a mostrar quantes instancies existeixen.
        System.out.println("Hi ha " + BinaryTree.getInstances() + " instàncies d'arbres.");
    }

    // F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
    public static void traverseRightBranch(BinaryTree.Node node) {
        if (node != null) {
            traverseRightBranch(node.getRight());
            System.out.println(node.getData());
        }
    }

    // G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
    public static void traverseLeftBranch(BinaryTree.Node node) {
        if (node != null) {
            traverseLeftBranch(node.getLeft());
            System.out.println(node.getData());
        }
    }
}