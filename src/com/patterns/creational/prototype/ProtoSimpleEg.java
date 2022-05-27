package com.patterns.creational.prototype;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class ProtoSimpleEg implements Cloneable {
    private String name;
    private int empId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
