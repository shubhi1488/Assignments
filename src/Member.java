/*
Create a class named 'Member' having the following members:

      Data members

1  - Name

2  - Age

3  - Phone number

4  - Address     5 - Salary

It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by making an object
  of both of these classes and print the value you assigned.
 */
public class Member {
    String Name;
    int age;
    int phonenumber;
    String address;
    double Salary;

    public Member(String name, int age, int phonenumber, String address, double salary) {
        Name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        Salary = salary;
    }
    void printSalary(){
        System.out.println("Salary "+Salary);

    }
}
class Employee extends Member{
    String specialization;
    public Employee(String Name,int age,int phonenumber,String address,double Salary,String specialization){
        super(Name,age,phonenumber,address,Salary);
        this.specialization=specialization;
    }
}
class Manager extends Member{
    String department;
    public Manager(String Name,int age,int phonenumber,String address,double Salary,String department){
        super(Name,age,phonenumber,address,Salary);
        this.department=department;
    }
}
class Main{
    public static void main(String[] args) {
        Employee emp=new Employee("Shubhi",20,8755055,"Bareilly",1000.10,"IT");
        Manager mng=new Manager("Rohan",45,941250,"Mathura",2000.15,"IT");
        emp.printSalary();
        mng.printSalary();
    }
}
