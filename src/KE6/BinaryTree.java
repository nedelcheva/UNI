package KE6;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    //Preorder
    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(BinaryTreeNode tn) {
        if(tn == null) {
            return;
        }

        System.out.print(tn.getEntry() + " ");
        printPreorder(tn.getLeftChild());
        printPreorder(tn.getRightChild());
    }

    //Inorder
    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(BinaryTreeNode tn) {
        if(tn == null) {
            return;
        }
        printInorder(tn.getLeftChild());
        System.out.print(tn.getEntry() + " ");
        printInorder(tn.getRightChild());

    }

    //Postorder
    public void printPostorder() {
        printPostorder(root);
    }

    private void printPostorder(BinaryTreeNode tn) {
        if(tn == null) {
            return;
        }

        printPostorder(tn.getLeftChild());
        printPostorder(tn.getRightChild());
        System.out.print(tn.getEntry() + " ");
    }

    //Create a tree
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
        if(current == null) {
            return new BinaryTreeNode(value);
        }
        if (value< current.entry) {
            current.leftChild = addRecursive(current.leftChild, value);
        } else if(value > current.entry) {
            current.rightChild = addRecursive(current.rightChild, value);
        } else {
            return current;
        }
        return current;
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree().createBinaryTree();
        bt.printPreorder();
        System.out.println();
        bt.printPostorder();
        System.out.println();
        bt.printInorder();
    }
}

class BinaryTreeNode {
    protected int entry;
    protected BinaryTreeNode leftChild;
    protected BinaryTreeNode rightChild;

    public BinaryTreeNode(int entry) {
        this.entry = entry;
    }

    public BinaryTreeNode(int entry, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this(entry);
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
