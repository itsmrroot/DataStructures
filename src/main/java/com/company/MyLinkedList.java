package com.company;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem current = root;
        ListItem previous = null;

        while (current != null) {
            int cmp = current.compareTo(item);
            if (cmp == 0) return false;

            if (cmp > 0) {
                item.setNext(current);
                if (previous == null) {
                    root = item;
                } else {
                    previous.setNext(item);
                }
                item.setPrevious(previous);
                current.setPrevious(item);
                return true;
            }
            previous = current;
            current = current.next();
        }
        previous.setNext(item);
        item.setPrevious(previous);
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {

        ListItem current = root;
        ListItem previous = null;

        while (current != null) {
            if (current.compareTo(item) == 0) {

                if (previous == null) {
                    root = current.next();
                } else {
                    previous.setNext(current.next());
                }

                if (current.next() != null) {
                    current.next().setPrevious(previous);
                }

                return true;
            }
            previous = current;
            current = current.next();
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem current = root;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
    }
}
