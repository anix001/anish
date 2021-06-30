package com.anish.day8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape implements Cloneable {
    protected String type;
    protected String data;
    private Integer size;

    abstract void draw();

    public Shape() {
        stimulateHittingTheDatabase();
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e){
            System.err.println("Exception:" + e);
        }
        return clone;
    }

    public void stimulateHittingTheDatabase() {
        try {
            System.out.println("Hitting the database");
            Thread.sleep(1000);
            data = "the heavy data";
            System.out.println("Ended hitting the database");
        } catch (Exception e) {
            System.out.println("Handled the error");
        }
    }
}
