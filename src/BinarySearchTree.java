/*************************************************
 File: BBinarySearchTree.java
 By: Jeanine Nebrija
 Date: 4/14/24
 Compile: Open directory as IntelliJ project, compile and run.
 System: Windows w/ Java
 Description: Implements a binary search tree with the insertion, deletion, search, in-order,
 pre-order, and post-order of the tree.
 *************************************************/


public class BinarySearchTree {
    public BinarySearchTree(){

    }

    static class Node {
        int key;
        Node left, right;
    };

    //Create new node on the BST; assign key
    Node newNode(int key){
        Node temp = new Node();
        temp.key = key;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    //Insert node (while searching recursively)
    Node insert(Node node, int key){
        if(node==null) return newNode(key);

        if(key<node.key){node.left=insert(node.left, key);}
        else if(key>node.key){node.right=insert(node.right, key);}

        return node;
    }

    //Print each key while performing in-order traversal
    void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    //Print each key while performing pre-order traversal
    void preOrder(Node n) {
        if (n == null) return;
        System.out.println(n.key);
        preOrder(n.left);
        preOrder(n.right);
    }

    //Print each key while performing post-order traversal
    void postOrder(Node root){
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    //Print each key while performing in-order traversal
    Node search(Node root, int key) {
        //Node found (or null root)
        if(root == null || root.key == key){
            System.out.println("NODE FOUND.");
            return root;
        }

        if(root.key<key){
            //Search key is greater than root key
            System.out.println(root.right.key+"...");
            return search(root.right, key);
        }else{
            //Search key is less than root key
            System.out.println(root.left.key + "...");
            return search(root.left, key);
        }
    }
}
