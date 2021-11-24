/*
Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the
name should be "Unknown", otherwise the name should be equal to the String
value passed while creating object of Student class.
 */
public class Student {
    String ss;
    String name;

    public Student(String ss) {
        name = ss;
    }
    public Student(){
        name="unknown";
    }
}
class Stu{
    public static void main(String[] args) {
        Student obj=new Student("shubhi");
        Student obj2=new Student();
        System.out.println(obj.name);
        System.out.println(obj2.name);




    }

}
