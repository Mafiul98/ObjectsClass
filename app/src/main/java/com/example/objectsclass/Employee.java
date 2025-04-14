package com.example.objectsclass;

public abstract class Employee {

  private String name;
   private String position;
   private float salary;

   public abstract float calculateTex();
   public abstract float calculateFinalSalary();

   public Employee(String empName,String empPosition,float empSalary){
       this.name=empName;
       this.position=empPosition;
       this.salary=empSalary;

   }



    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }
}
