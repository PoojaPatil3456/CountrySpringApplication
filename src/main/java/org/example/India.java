package org.example;

public class India {
    private int noOfStates;
    private String flag;

    public India() {System.out.println("default constructor");}

    public India(int id, String name) {
        this.noOfStates = id;
        this.flag = name;
    }

    void show(){
        System.out.println(noOfStates+" "+flag);
    }

}