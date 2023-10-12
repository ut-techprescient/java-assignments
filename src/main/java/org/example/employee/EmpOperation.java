package org.example.employee;

import org.example.base.Assignment;

public class EmpOperation extends Assignment {
    private final EmployeeDao empDao = new EmployeeDao();

    private void generateEmployees(int records){
        for(int i=1; i<records+1; i++){
            empDao.addEmployee("Emp-"+i, i*1000, i);
        }
    }

    private void showAll(){
        empDao.showAllEmployee();
    }

    @Override
    public void execute() {
        int empSet = this.takeIntegerInput("Add number of employees to generate");
        generateEmployees(empSet);
        showAll();
    }
}
