package com.company;

public  abstract class ListItem {
    protected  ListItem rightLink;
    protected  ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

     abstract ListItem next();
     abstract void setNext(ListItem item);

     abstract ListItem previous();
     abstract void setPrevious(ListItem item);

     abstract int compareTo(Object other);

    public Object getValue() { return value; }

    public void setValue(Object value) { this.value = value; }


}
