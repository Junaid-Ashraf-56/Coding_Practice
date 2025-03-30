package Assignment2;

public class C {
    private int p;
    public C() {
        System.out.println("C's no-arg constructor invoked");
        this(0);
    }

    public C(int p) {
        p = p;
    }

    public void setP(int p) {
        p = p;
    }
}
public class Question3 {
    public static void main(String[] args) {
        C c1 = new C();
    }
}
