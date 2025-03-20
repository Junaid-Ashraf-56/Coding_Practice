import java.util.Scanner;

class First1{
    private int Math;
    private int OOP;
    private int PP;

    public  void setMarks(int x ,int y ,int z){
        Math = x ;
        OOP = y;
        PP = z;

    }

    public int getMath(){
        return Math;
    }
    public int getOOP(){
        return OOP;
    }
    public int getPP(){
        return PP;
    }
    public void getMarks(){
        Scanner abc = new Scanner(System.in);
        int x = abc.nextInt();
        int y = abc.nextInt();
        int z = abc.nextInt();
        setMarks(x, y, z);
    }

    public void  Display(){
        System.out.println(getMath() +" "+getOOP()+" "+getPP());
    }

    public static void main(String[] args) {
        First1 S1 = new First1();
        First1 S2 = new First1();

        S1.getMarks();
        S2.getMarks();

        S1.Display();
        S2.Display();
    }
 }