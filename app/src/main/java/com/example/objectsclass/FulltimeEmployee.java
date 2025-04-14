package com.example.objectsclass;

public class FulltimeEmployee extends Employee {


    public FulltimeEmployee(String empName, String empPosition, float empSalary) {
        super(empName, empPosition, empSalary);
    }

    @Override
    public float calculateTex() {
        return getSalary()*5/100;
    }

    @Override
    public float calculateFinalSalary() {
        return getSalary()-calculateTex();
    }
}
