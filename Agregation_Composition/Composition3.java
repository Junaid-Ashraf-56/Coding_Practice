package Agregation_Composition;

class Heart{
    public void display(){
        System.out.println("This Human Has heart");
    }
}
class Human{
   private final Heart heart;
   Human(){this.heart = new Heart();}
    public void HasHeart(){
       heart.display();
    }
}
public class Composition3 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.HasHeart();
    }
}
