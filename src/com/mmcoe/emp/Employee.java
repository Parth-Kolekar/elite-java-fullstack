package com.mmcoe.emp;

public  abstract class Employee {
    public double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
