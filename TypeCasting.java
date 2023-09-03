public class TypeCasting {
    public static void main(String[] args) {
        //implicit tyoecasting(int to double)
        int a,b;
        a=11;
        b=20;
        double a1,b1,div;
        a1=a;
        b1=b;
        div=a1/b1;
    System.out.println("div is "+div);
//explicit typecasting(double to int) 
//destination variable=(destination variable)source variable
double pi=3.14;
int p=(int)pi;
System.out.println("P value is"+p);

    
}
}