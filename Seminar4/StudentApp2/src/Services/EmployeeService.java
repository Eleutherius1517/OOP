package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;

public class EmployeeService implements iGenericInterface<Employee> {
    private int count;
    private List<Employee> lstEmployees;
    public EmployeeService() {
        this.lstEmployees = new ArrayList<>();
    }
    public void sortBySecondName(){
        PersonComparator<Employee> employeeComp = new PersonComparator<>();
        this.lstEmployees.sort(employeeComp);
    }
    @Override
    public List<Employee> getAll() {
        return lstEmployees;
    }
    @Override
    public void create(String name, int age) {
        lstEmployees.add(new Employee(name, age, "basic"));
        count++;
    }
    
}
