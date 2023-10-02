package New_folder;

public class Student {
    String name;
    int rollNo;
    int age;
    String address;
void initializedStudent()
{
        name="payal";
        rollNo=21;
        age=20;
        address="new panvel";

}
void displayStudent()
{
        System.out.println("name is "+name);
        System.out.println("rollNo is"+rollNo);
        System.out.println("age is"+age);
        System.out.println("address is"+address);
}
public static void main(String args[])
{
        Student St=new Student();
        St.initializedStudent();
        St.displayStudent();
        

}

}
