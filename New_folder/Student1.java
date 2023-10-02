public class Student1 {
        int studId;
        String studName;
       float studper;
        String studHobby;
        Student1()
        {
                System.out.println("I am in default constructor");
                studId=220;
                studName="Rajmudra";
                studPer="98";
                studHobby="Reading Motivational";
        }
    //PARAMETERIZED CONSTRUCTOR
    Student1(int id,String name,String hobby,Float per)
    {
            System .out.println("I am in parameterized constructor");
            studId=id;
            studName=name;
            studPer=per;
            studHobby=hobby;
            
    }
    void displayStudent1()
    {
        System.out.println("id is"+studId);
        System.out.println("name is"+studName);
        System.out.println("per is"+studPer);
        System.out.println("hobby  is"+studHobby);
    }
    
    }
    
        
    
    
 

