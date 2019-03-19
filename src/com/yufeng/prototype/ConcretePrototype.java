package com.yufeng.prototype;

public class ConcretePrototype implements Prototype {
    private String name;

    @Override
    public Object clone() {
        Prototype prototype = new ConcretePrototype();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String Name) {
        this.name = Name;
    }
}
