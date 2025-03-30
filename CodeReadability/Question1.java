package CodeReadability;

class PascalCase
{
    int n;
    PascalCase(int a)
    {
        n=a;
    }
    void show()
    {
        System.out.println("Value stored in PascalCase: "+n);
    }
}
class CamelCase extends PascalCase
{
    CamelCase(int a)
    {
        super(a);
    }
}
public class Question1
{
    public static void main(String[] args)
    {
        CamelCase o =new CamelCase(5);
        o.show();
    }
}
