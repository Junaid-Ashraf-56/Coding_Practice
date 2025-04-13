package Agregation_Composition;

import java.util.Arrays;
import java.util.List;

class Teacher{
    private final String subject;
    private final String name;

    Teacher(String subject, String name){
        this.subject = subject;
        this.name = name;
    }
    public void teach(){
        System.out.println("Yes");
    }
    public void markAttendence(){
        System.out.println("Marked");
    }
    @Override
    public String toString(){
        return name+" "+subject;
    }
}
class Department{
   private final List<Teacher>teachers;
   Department(List <Teacher>teachers){
       this.teachers = teachers;
   }
   public void display(){
       for (Teacher teacher : teachers){
           System.out.println(teacher);
       }
   }
}
public class Aggregation1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("OOP","Abida");
        Teacher t2 = new Teacher("TBW","Azha");
        t1.markAttendence();
        t1.teach();
        List<Teacher>teachers = Arrays.asList(t1,t2);
        Department d1 = new Department(teachers);
        d1.display();
    }
}
