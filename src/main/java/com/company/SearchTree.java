package com.company;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem current = this.root;

        while (true) {
            int cmp = current.compareTo(item);

            if (cmp == 0) {
                return false;
            }
            if (cmp > 0) {
                if (current.previous() == null) {
                    current.setPrevious(item);
                    return true;
                }
                current = current.previous();
            } else {
                if (current.next() == null) {
                    current.setNext(item);
                    return true;
                }
                current = current.next();
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {

        ListItem current = root;
        ListItem parent = null;

        while (current != null) {
            int cmp = current.compareTo(item);

            if (cmp == 0) {
                performRemoval(current, parent);
                return true;
            }

            parent = current;
            current = (cmp > 0) ? current.previous() : current.next();
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {


        if (item.previous() != null && item.next() != null) {

            ListItem successorParent = item;
            ListItem successor = item.next();

            while (successor.previous() != null) {
                successorParent = successor;
                successor = successor.previous();
            }

            item.setValue(successor.getValue());
            performRemoval(successor, successorParent);
            return;
        }


        ListItem child = (item.previous() != null) ? item.previous() : item.next();

        if (parent == null) {
            root = child;
        } else if (parent.previous() == item) {
            parent.setPrevious(child);
        } else {
            parent.setNext(child);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            return;
        }
        traverse(root.previous());
        System.out.println(root.getValue());
        traverse(root.next());
    }
}
