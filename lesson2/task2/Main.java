public class Main {
    public static void main(String[] args) {

        Employee developer = new Employee("Петя", "Клюшкин", 2459834);
        IdCard card = new IdCard(777);
        Department department = new Department("Отдел кадров");

        developer.setIdCard(card);
        department.addEmployee(developer);

        System.out.println("работник " + developer.getName() + " имеет карту с номером " + card.getNumber() + " числится за отделом - " + department.getName());
    }
}
