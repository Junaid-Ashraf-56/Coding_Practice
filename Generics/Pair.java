package Generics;

class Hello1<K,V>{
    K value;
    V value1;

    public Hello1(){}
    public Hello1(K value,V value1){
        this.value=value;
        this.value1=value1;
    }

    public K getValue() {return value;}
    public void setValue(K value) {this.value = value;}
    public V getValue1() {return value1;}
    public void setValue1(V value1) {this.value1 = value1;}

    public void display(){
        System.out.println("Value "+getValue()+" Value 1 "+getValue1());
    }
}
public class Pair {
    public static void main(String[] args) {
        Hello1<String,Integer> h1 = new Hello1<>();
        h1.setValue("Junaid");
        h1.setValue1(58);
        h1.display();

        Hello1<Boolean,String> h2 = new Hello1<>();
        h2.setValue(true);
        h2.setValue1("Junaid");
        h2.display();

    }
}
