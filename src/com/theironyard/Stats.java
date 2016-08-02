package com.theironyard;

/**
 * Created by jenniferchang on 8/1/16.
 */
public class Stats {
    String gender;
    float weight;
    float height;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != "Male" & gender != "Female") {
            System.err.println("Not valid gender");
        } else {
            this.gender = gender;
        }
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight < 0 || weight > 10000) {
            System.err.println("Not valid weight");
        } else {
            this.weight = weight;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height < 0) {
            System.err.println("Height too short");
        } else if (height > 400) {
            System.err.println("Height too tall");
        } else {
            this.height = height;
        }

    }








}
