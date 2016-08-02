package com.theironyard;

/**
 * Created by jenniferchang on 8/1/16.
 */
public class Profile {
    String name;
    int age;
    boolean single;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Age too young!");
        } else if (age > 125) {
            System.err.println("Age too old!");
    } else {
        this.age = age;
        }
}

    public boolean getSingle() {
        return single;
    }

    public void setSingle (boolean single) {
        this.single = single;
    }
}

