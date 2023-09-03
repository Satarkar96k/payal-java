public class TypesOfVariables 
{
    int result;
    int sum()
    {
        int a,b;
        a=10;
        b=20;
        result=a+b;
        return result;
    }
    int div()
    {
        int a,b;
        a=20;
        b=10;
        result=a/b;
        return result;

    }

    
public static void main(String args[])
{ 
    TypesOfVariables ty= new TypesOfVariables();
    System.out.println("sum is "+ty.sum());
    System.out.println("div is " +ty.div());

}


    
    
}
