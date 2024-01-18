package Seminar6.1SRP;

import java.util.*;

public class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
public class CountingRoom{
    private Map<Employee, Integer> employeeSalary = new HashMap<>();

    public void calculateNetSalary(Employee employee, int baseSalary){
        employeeSalary.put(employee, baseSalary);
    }

    public int calculateNetSalary(Employee employee) {
        int baseSalary = employeeSalary.get(employee);
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
