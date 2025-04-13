package com.example.objectsclass;

public class Employee {

  private String name;
   private String position;
   private float salary;

   public Employee(String empName,String empPosition,float empSalary){
       this.name=empName;
       this.position=empPosition;
       this.salary=empSalary;

   }

   public Employee(String empName,String empPosition,float empSalary,float ebsent){
       this.name=empName;
       this.position=empPosition;
       this.salary=empSalary - (ebsent*500);

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
