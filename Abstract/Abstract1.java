package Abstract;
//This is about shape

abstract class Shape{
 abstract int CalculateArea();

 public void display(){
     System.out.println("Area is" + CalculateArea());
 }
}
class Circle extends Shape{
    int r;

    public Circle(int r){
        this.r = r;
    }
    @Override
    int CalculateArea(){
       return  (int) ((3.14159)*r*r);
    }
}
class Rectangle extends Shape{
    int l,w;
    Rectangle(int l ,int w){
        this.l =  l;
        this.w = w;
    }
    @Override
    int CalculateArea(){
        return l*w;
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(5,5);

        c1.display();
        r1.display();
    }
}
