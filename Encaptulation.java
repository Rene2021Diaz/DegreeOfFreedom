/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

public class Encaptulation {
     public static void main(String[] args) {
        Encaptulation employee = new Encaptulation(1009692, "Rene Diaz", 50000.00);
        
        System.out.println("Employee number: " + employee.getEmpno());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee salary: $" + employee.getSalary());
        
         //Encaptulation employee = new Encaptulation(123, "Rene Diaz", 50000.00);
        
        double currentSalary = employee.getSalary();
        double salaryIncrease = 0.05 * currentSalary;
        double newSalary = currentSalary + salaryIncrease;
        
        employee.setSalary(newSalary);
        
        System.out.println("Employee number: " + employee.getEmpno());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee new salary: $" + employee.getSalary());
    }
    
    private int empno;
    private String name;
    private double salary;
    
    public Encaptulation(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    
    public int getEmpno() {
        return empno;
    }
    
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class EmployeeManager {
    
}

class SalaryIncrease {
    
}


