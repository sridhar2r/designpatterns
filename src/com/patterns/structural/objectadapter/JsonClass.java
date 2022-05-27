package com.patterns.structural.objectadapter;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class JsonClass {
    private String employeeName;
    private long personAge;
    private double salary;
    private double tax;

    @Override
    public String toString() {
        return "JsonClass{" +
                "employeeName='" + employeeName + '\'' +
                ", personAge=" + personAge +
                ", salary=" + salary +
                ", tax=" + tax +
                '}';
    }

    public JsonClass() {
    }

    public JsonClass(String employeeName, int personAge, double salary, double tax) {
        this.employeeName = employeeName;
        this.personAge = personAge;
        this.salary = salary;
        this.tax = tax;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getPersonAge() {
        return personAge;
    }

    public void setPersonAge(long personAge) {
        this.personAge = personAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
