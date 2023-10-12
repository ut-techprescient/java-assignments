package org.example.employee;


public class EmployeeModel{
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;
    private int Salary;
    private int Id;

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", Id=" + Id +
                '}';
    }

    public EmployeeModel(String name, int salary, int id) {
        this.Name = name;
        Salary = salary;
        Id = id;
    }


    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
