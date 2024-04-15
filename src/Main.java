/*************************************************
 File: BBinarySearchTree.java
 By: Jeanine Nebrija
 Date: 4/14/24
 Compile: Open directory as IntelliJ project, compile and run.
 System: Windows w/ Java
 Description: Main driver for implementing functionalities of the binary search tree.
 *************************************************/

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();

        System.out.println("INSERTING ELEMENT '5'.");
        BinarySearchTree.Node root=bst.insert(null, 5);
        System.out.println("INSERTING ELEMENT '3'.");
        bst.insert(root, 3);
        System.out.println("INSERTING ELEMENT '2'.");
        bst.insert(root, 2);
        System.out.println("INSERTING ELEMENT '4'.");
        bst.insert(root, 4);
        System.out.println("INSERTING ELEMENT '7'.");
        bst.insert(root, 7);
        System.out.println("INSERTING ELEMENT '6'.");
        bst.insert(root, 6);
        System.out.println("INSERTING ELEMENT '1'.");
        bst.insert(root, 1);

        System.out.println("SEARCH FOR NODE WITH KEY=6:");
        bst.search(root,6);

        System.out.println("IN-ORDER TRAVERSAL:");
        bst.inOrder(root);

        System.out.println("PRE-ORDER TRAVERSAL:");
        bst.preOrder(root);

        System.out.println("POST-ORDER TRAVERSAL:");
        bst.postOrder(root);
    }
}