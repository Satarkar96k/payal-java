package New_folder;


import java.util.Scanner;




public class AreaOfCircle1 {

    public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius for circle area");
    float radius=sc.nextFloat();
    final float pi=3.14f;
    float area=pi*radius*radius;
    System.out.println("area of circle is"+area);

}
    
}
