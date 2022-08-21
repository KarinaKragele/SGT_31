package oop.members;

public class Member {
    //Fields
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

   public void printSalary(){
        System.out.println("Member's salary is: " + salary + " EUR");
    }
}
