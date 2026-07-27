package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== MyLinkedList ===");
        MyLinkedList list = new MyLinkedList(null);

        list.addItem(new Node(5));
        list.addItem(new Node(2));
        list.addItem(new Node(8));
        list.addItem(new Node(2)); // duplicate, should be rejected

        System.out.println("After adding 5, 2, 8, 2(dup):");
        list.traverse(list.getRoot());

        list.removeItem(new Node(2));
        System.out.println("After removing 2:");
        list.traverse(list.getRoot());

        System.out.println();
        System.out.println("=== SearchTree ===");
        SearchTree tree = new SearchTree(null);

        tree.addItem(new Node(5));
        tree.addItem(new Node(2));
        tree.addItem(new Node(8));
        tree.addItem(new Node(1));
        tree.addItem(new Node(3));
        tree.addItem(new Node(7));
        tree.addItem(new Node(9));

        System.out.println("Inorder traversal (should be sorted):");
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node(5)); // remove root with two children
        System.out.println("After removing root (5):");
        tree.traverse(tree.getRoot());
    }
}
