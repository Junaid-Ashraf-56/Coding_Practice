 class Student2{
    public String name;
    public int rollNumber ;
    Student2(){
        this.name="Unknown";
        this.rollNumber=404;
    }
    public void NUM(String a,int b){
        name = a;
        rollNumber = b;
    }
    public void display(){
        System.out.println(name+" "+rollNumber);
    }
}
public class First
{
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.name = "Junaid";
        s2.rollNumber=58;
        s2.display();
    }
    }

