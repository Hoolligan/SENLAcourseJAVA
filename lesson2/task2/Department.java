import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Employee> employees = new HashSet<Employee>();

    public Department(String name) {
        this.name = name;
        System.out.println("Department");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
        newEmployee.setDepartment(this);
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }
}