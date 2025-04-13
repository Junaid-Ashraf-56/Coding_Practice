package Agregation_Composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
private final String name;
private final int rollNumber;
private final int semester;
Student(String name,int rollNumber,int semester){
    this.name = name;
    this.rollNumber = rollNumber;
    this.semester = semester;
}
public void attendClass(){
    System.out.println(this.name+"No");
}
public void submitAssignment(){
    System.out.println(this.name+"Yes");
}
@Override
public String toString(){
    return name+" "+rollNumber+" "+semester;
}
}
class University{
    private final String universityName;
    private final List<Student>students;
    University(String universityName,List<Student>students){
        this.universityName = universityName;
        this.students = students;
    }
    public void enrollStudent(Student s){
        students.add(s);
    }
    public void printStudentList(){
        for (Student student:students){
            System.out.println(student+ " "+universityName);
        }
    }
}
public class Aggregation3 {
    public static void main(String[] args) {
        Student s1 = new Student("Junaid ",58,3);
        Student s2 = new Student("Junaid0 ",58,3);
        Student s3 = new Student("Junaid1 ",58,3);
        s1.attendClass();
        s3.submitAssignment();
        List<Student>students = new ArrayList<>(Arrays.asList(s1,s3));
        University u1 = new University("COMSAT",students);
        u1.enrollStudent(s2);
        u1.printStudentList();

    }
}
