

import java.util.Scanner;

class Student{
    private int StudentId;
    private String StudentName;
    private String Program;
    private int GPA ;

    public void setInfo(int x,String y ,String z,int w){
      StudentId = x ;
      StudentName = y;
      Program = z;
      GPA = w;
    }
    public int getStudentId(){
        return StudentId;
    }
    public String getStudentName(){
        return StudentName;
    }
    public String getProgram(){
        return Program;
    }
    public int getGPA(){
        return GPA;
    }
    public void getInfo(){
        Scanner abc = new Scanner(System.in);
        int x = abc.nextInt();
        int w = abc.nextInt();
        String y = abc.nextLine();
        String z = abc.nextLine();

        setInfo(x,y,z,w);
    }
    public void display(){
        System.out.println(getStudentId() + " "+getStudentName()+" "+getProgram()+" "+getGPA());
    }
}
class Task1SG {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.getInfo();
        S1.display();
    }
}