public class Customer1 {
    int custId;
    String custName;
    Customer1()
    {
            System.out.println("I am in default constructor");
            custId=220;
            custName="payal";

    }
//PARAMETERIZED CONSTRUCTOR
Customer1(int id,String name)

{
        System .out.println("I am in parameterized constructor");
        custId=id;
        custName=name;
        
}
void displayCustomer1()
{
    System.out.println("id is"+custId);
    System.out.println("name is"+custName);
}

}

    



