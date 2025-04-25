package Agregation_Composition;

class Pages1{
    private final int pagenumber;
    Pages1(int pagenumber){
        this.pagenumber=pagenumber;
    }
    public void display(){
        System.out.println("Pages are"+pagenumber);
    }
}
class Book1{
   private final Pages1[] pages1;
   Book1(int numPages){
       this.pages1 = new Pages1[numPages];
       for (int i = 0; i < numPages; i++) {
           pages1[i]= new Pages1(i+1);
       }
   }
   public void display1(){
       for (Pages1 pages2:pages1){
           pages2.display();
       }
   }
}
public class Composition2 {
    public static void main(String[] args) {
        Book1 b1 = new Book1(3);
        b1.display1();
    }
}
