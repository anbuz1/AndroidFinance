package ru.buz.core.models;

import java.io.Serializable;
import java.util.List;


class Magazine implements Serializable {

    long id;

    private String name;

    private List<Magazine> children;

    private Magazine parent;



    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public boolean add(Magazine child) {
        return children.add(child);
    }

    public boolean remove(Magazine magazine) {
        return children.remove(magazine);
    }

    public List<Magazine> getChildren() {
        return children;
    }

    public Magazine getChild(long idChild) {
        for (Magazine child : children) {
            if(child.getId()==idChild) return child;
        }
        return null;
    }

    public Magazine getChild(String name){
        for (Magazine child : children) {
            if(child.getName().equals(name)) return child;
        }
        return null;
    }

    public Magazine getParent() {
        return parent;
    }

    public void setParent(Magazine parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return name;
    }
}
