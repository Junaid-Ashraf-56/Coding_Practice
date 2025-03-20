class Student1{
    public String name ;
    public int marks;
    Student1(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println(name+" "+marks);
    }
}
public class Const1 {
public static void  updateMarks(Student1 s1 ,int newMarks){
    s1.marks = newMarks;
}

    public static void main(String[] args) {
        Student1 s1 = new Student1("Junaid",80);
        s1.display();
        updateMarks(s1, 88);
        s1.display();
    }
}
