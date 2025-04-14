package com.example.objectsclass;

public class ParttimeEmployee extends Employee{


    public ParttimeEmployee(String empName, String empPosition, float empSalary) {
        super(empName, empPosition, empSalary);
    }

    @Override
    public float calculateTex() {
        return getSalary()*10/100;
    }

    @Override
    public float calculateFinalSalary() {
        return getSalary()-calculateTex();
    }
}
