package com.theironyard;

/**
 * Created by jenniferchang on 8/1/16.
 */
public class Animal {
    String name;
    boolean mammal;
    boolean large;
    boolean extinct;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !="") {
            this.name = name;
        } else {
            System.err.println("Not a valid animal");
        }
    }

    public boolean getMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

    public boolean getLarge() {
        return large;
    }

    public void setLarge(boolean large) {
        this.large = large;
    }

    public boolean getExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    public String getType() {
        return type;
    }

    public void setType (String type) {
        if (type == "") {
            System.err.println("Not a valid type");
        } else {
            this.type = type;
        }
    }












}
