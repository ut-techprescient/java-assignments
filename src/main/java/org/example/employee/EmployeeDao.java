package org.example.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class EmployeeDao {
    private final ArrayList<EmployeeModel> employeeList = new ArrayList<>();

    public void addEmployee(String name, int salary, int id){
        employeeList.add(new EmployeeModel(name, salary, id));
    }

    public void showAllEmployee(){
        for (EmployeeModel currentModel : employeeList) {
            System.out.println(currentModel.toString());
        }
    }

    public int updateEmployee(EmployeeModel empModel){
        for (EmployeeModel currentModel : employeeList) {
            if (currentModel.getId() == empModel.getId()) {
                currentModel.setName(empModel.getName());
                currentModel.setSalary(empModel.getSalary());
                System.out.println("Employee updated successfully");
                return 1;
            }
        }

        return 0;
    }

}
