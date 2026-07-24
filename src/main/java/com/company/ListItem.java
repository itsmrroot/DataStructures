package com.company;

public  abstract class ListItem {
    protected  ListItem rightLink;
    protected  ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

     abstract ListItem next();
     abstract void setNext();

     abstract ListItem previous();
     abstract void setPrevious();

     abstract int compareTo();

    public Object getValue() { return value; }

    public void setValue(Object value) { this.value = value; }


}
