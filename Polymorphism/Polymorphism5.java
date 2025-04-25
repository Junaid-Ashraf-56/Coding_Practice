package Polymorphism;

//Q5. Runtime Polymorphism and Arrays
//Create a superclass Shape with draw() method. Subclasses: Circle, Rectangle, Triangle.
//Store them in an array of type Shape[] and use a loop to call draw() on each object.

class Shape{
    public void draw(){
        System.out.println("Just draw");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Rectangle");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Rectangle");
    }
}
public class Polymorphism5 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(),new Rectangle(), new Triangle()};
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
