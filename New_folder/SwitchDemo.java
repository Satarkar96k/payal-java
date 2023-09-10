package New_folder;

import java.util.Scanner;


public class SwitchDemo {

    
    public static void main(String[]args)
    {
        System.out.println("Enter Greetings");
        Scanner sc= new Scanner(System.in);
    String type=sc.nextLine();
        System.out.println("enter time AM,PM,NOON");
        String time=Sc.nextLine();
    switch(type)
    {
        case "Good Morning":
                                System.out.println("Good Morning");
                                    switch(time)
                                    {
                                        case "AM":
                                                    System.out.println("AM valid");
                                                    break;
                                        default:
                                                    System.out.println("you entered wrong time ");
                                                    

                                    }
                                break;
        case "Good Evening":
                                System.out.println("Good Evening");
                                switch(time)
                                {
                                        case "PM":
                                                    System.out.println("PM valid");
                                                    break;
                                         default:
                                                    System.out.println("you entered wrong time");         

                                }
                                break;
        case "Good  Afternoon":
                                System.out.println("Good Afternoon");
                                switch(time)
                                {
                                        case "NOON":
                                                    System.out.println("NOON valid");
                                                    break;
                                        default:
                                                    System.out.println("you entered wrong time");

                                }
                                break;
        case "Good Night":
                                System.out.println("Good Night");
                                switch(time)
                                {
                                        case "NIGHT":
                                        System.out.println("NIGHT valid");
                                                    break;
                                        default:
                                                    System.out.println("you entered wrong time");

                                }
                                break;
        default:
                                System.out.println("invalid input");
                                break;
        

    }
    }

                        



    
}
    

