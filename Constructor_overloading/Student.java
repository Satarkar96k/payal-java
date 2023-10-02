package Constructor_overloading;

public class Student {
    String name,email;int rollNo,marks,pin;
    Student(int marks,int pin)
    {
            System.out.println("I am in first constructor");
            this.marks=marks;
            this.pin=pin;    
    }
    Student(int marks,String name)
    {
            System.out.println("I am in Second constructor");
            this.marks=marks;
            this.name=name;
    }
    Student(String name,int rollNo)
    {
            System.out.println("I am in third constructor");
            this.name=name;
            this. rollNo=rollNo;   
    }
    Student(int rollNo,String email,String name)
    {
            System.out.println("I am in Fourth constructor");
            this.rollNo=rollNo;
            this.email=email;
            this.name=name;    
    }
void display()
{
        System.out.println("marks is "+marks);
        System.out.println("name is "+name);
        System.out.println("rollNo is "+rollNo);
        System.out.println("email is "+email);
        System.out.println("pin is"+pin);
}
public static void main(String[]args)
{
        Student st1=new Student(100,410206);
        st1.display();
        Student st2=new Student("Shivkanya",21);
        st2.display();
        Student st3=new Student(21,"Rajmudra");
        st3.display();
        Student st4=new Student(21,"payalnirmal21@gmail.com","payal");
        st4.display();

}
}







    

