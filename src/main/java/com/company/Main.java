package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== MyLinkedList ===");
        MyLinkedList list = new MyLinkedList(null);

        list.addItem(new Node("banana"));
        list.addItem(new Node("apple"));
        list.addItem(new Node("cherry"));
        list.addItem(new Node("apple")); // duplicate, should be rejected

        System.out.println("After adding banana, apple, cherry, apple(dup):");
        list.traverse(list.getRoot());

        System.out.println();
        System.out.println("Removing 'apple':");
        list.removeItem(new Node("apple"));
        list.traverse(list.getRoot());

        System.out.println();
        System.out.println("=== SearchTree ===");
        SearchTree tree = new SearchTree(null);

        tree.addItem(new Node("mango"));
        tree.addItem(new Node("banana"));
        tree.addItem(new Node("peach"));
        tree.addItem(new Node("apple"));
        tree.addItem(new Node("cherry"));
        tree.addItem(new Node("kiwi"));
        tree.addItem(new Node("plum"));
        tree.addItem(new Node("banana")); // duplicate, should be rejected

        System.out.println("Inorder traversal (should be alphabetical):");
        tree.traverse(tree.getRoot());

        System.out.println();
        System.out.println("Removing root ('mango') - two children case:");
        tree.removeItem(new Node("mango"));
        tree.traverse(tree.getRoot());

        System.out.println();
        System.out.println("Removing a leaf ('kiwi'):");
        tree.removeItem(new Node("kiwi"));
        tree.traverse(tree.getRoot());

        System.out.println();
        System.out.println("Removing something not in the tree ('grape'):");
        boolean removed = tree.removeItem(new Node("grape"));
        System.out.println("Removed? " + removed);
    }
}
