class NUM{
    private final int a;
    private int b;

    public NUM(){
        this.a=10;
        this.b=5;
    }
    public NUM(int x){
        a = x;
    }
    public NUM(int x ,int y){
        a = x;
        b = y;
    }
    public void display(){
        System.out.println(a +" "+b);
    }
}
class Constructor1 {
    public static void main(String[] args){
        NUM a1 = new NUM();
        a1.display();
        NUM a2 = new NUM(7);
        a2.display();
        NUM a3 = new NUM(6,7);
        a3.display();
    }
}