package This_demo;

public class Student {
    int marks;
    String name;
    Student(int marks,String name)
    {
            System.out.println("I am in parameterized constructor");
           this.marks =marks;
           this.name=name;
  }
    void display()
    {
            System.out.println("marks is "+marks);
            System.out.println("name is "+name);
    }
    public static void main(String[]args)
    {
        Student st=new Student(100,"Rajmudra");
        st.display();
    }
}
