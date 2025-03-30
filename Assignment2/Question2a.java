package Assignment2;

class C {
    private int p;
    public C() {
        this(0);
        System.out.println("C's no-arg constructor invoked");
    }

    public C(int p) {
       this.p = p;
    }

    public void setP(int p) {
        this.p = p;
    }
    public void display(){
        System.out.println(p);
    }
}
public class Question2a {
    public static void main(String[] args) {
        C c1 = new C();
        c1.setP(25);
        c1.display();
    }
}
