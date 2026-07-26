package com.company;


import java.util.LinkedList;

public class MyLinkedList  implements NodeList{
    ListItem root;
    LinkedList<ListItem> list = new LinkedList<>();

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if ((list.isEmpty())){
            list.addFirst(item);
            return true;
        }
        if (list.contains(item)) {
            return false;
        }
        if(list.indexOf(item)< list.size()){
            list.addFirst(item);
            return true;

        }
        list.add(item);



        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (list.contains(item)) {
            list.remove(item);
            return true;
        }

        return false;
    }


    @Override
    public void traverse() {

    }
}
