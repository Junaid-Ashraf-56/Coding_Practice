package Polymorphism;

//Q3. Interface Polymorphism
// Creates an interface Playable with a method play(). Implement it in two classes: Football and Cricket.
//Create a method that takes Playable as a parameter and call play() using different implementations.

interface Playable{
    void play();
}
class Football implements Playable{
    @Override
    public void play(){
        System.out.println("Player play Football");
    }
}
class Cricket implements Playable{
    @Override
    public void play(){
        System.out.println("Player play cricket");
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        check(new Football());
        check(new Cricket());
    }
    public static void check(Playable playable){
        playable.play();
    }
}
