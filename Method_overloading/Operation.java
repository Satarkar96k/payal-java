package Method_overloading;

public class Operation {
    void add(int a,int b)
    {
            System.out.println("first method add is"+(a+b));
    }
    void add(int a,int b,int c)
    {
            System.out.println("second add is"+(a+b+c));
    }
    void add (int a,int b,int c,int d)
    {
            System.out.println("third add is "+(a+b+c+d));
    }
    void add(int a,float b)
    {
            System.out.println("fouth method is"+(a+b));
    }
    void add (float b,int a)
    {
            System.out.println("fifth method is"+(b+a));
    }
    int add(int a,double b)
    {
            System.out.println("sixth method add is"+(a+b));
            int c=(int)b;
            return a+c;
    }
    public static void main(String[]args)
    {
            Operation op=new Operation();
            System.out.println(op.add(10,10.20));
            System.out.println("-----------------");            op.add(10,10.20f);
            op.add(10,10.20f);

    }
    

    
}
