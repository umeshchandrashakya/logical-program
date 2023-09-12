package org.java8.feature.grupingby;

public class Employee {
    private int empId;
    private String empName;
    private int depId;
    private String active="active";
    private int salary;

    public Employee(int empId, String empName, int depId, String active, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.depId = depId;
        this.active = active;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", depId=" + depId +
                ", active='" + active + '\'' +
                ", salary=" + salary +
                '}';
    }
}
