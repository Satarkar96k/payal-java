package New_folder;

public class Customer {
    int custId;
    String custName;
//IN DEFAULT CONSTRUCTOR
    Customer()
    {
            System.out.println("I am in default constructor");
            custId=220;
            custName="payal";

    }
//PARAMETERIZED CONSTRUCTOR
Customer(int id,String name)
{
        System .out.println("I am in parameterized constructor");
        custId=id;
        custName=name;
        
}
void displayCustomer()
{
    System.out.println("id is"+custId);
    System.out.println("name is"+custName);
}

}

    

