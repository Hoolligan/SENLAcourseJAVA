public class Employee extends Man {

    private int idNumber;
    private IdCard idCard;
    private Department department;

    public Employee(String name, String surname, int idNumber) {
        super(name, surname);
        this.idNumber = idNumber;
        System.out.println("Employee");
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
