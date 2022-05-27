package com.patterns.structural.objectadapter;

import java.time.LocalDate;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class XmlClass {
    private String name;
    private LocalDate dateOfBirth;
    private double salary;

    public XmlClass(String name, LocalDate dateOfBirth, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public XmlClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
