package oop.members;

public class JobClassCalling {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.name = "John";
        employee.age = 34;
        employee.phoneNumber = "+371367435";
        employee.address = "Riga";
        employee.salary = 1234;
        employee.specialization = "Specialist";
        employee.printSalary();

        manager.name = "Lisa";
        manager.age = 65;
        manager.phoneNumber = "+371312435";
        manager.address = "Oslo";
        manager.salary = 1454;
        manager.department = "Sales";
        manager.printSalary();
    }
}
