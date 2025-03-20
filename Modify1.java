
class University{
    private String StudentName;
    private String Department;

    public void setUniversity(String a,String b){
        StudentName = a;
        Department = b;
    }
    public String getStudentName(){
        return StudentName;
    }
    public String getDepartment(){
        return Department;
    }
    public void display(){
        System.out.println(getStudentName()+" "+getDepartment());
    }
}
public class Modify1 {
    public static void main(String[] args) {
        University u1 = new University();
        u1.setUniversity("Junaid","CS");
        u1.display();
        Modify(u1);
    }
    public static void Modify(University U1){
        U1.setUniversity("Juanid","SE");
        U1.display();
    }
}
