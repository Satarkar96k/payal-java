package New_folder;

import java.util.Scanner;

public class UserDefined {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=100;i++)
        {
                System.out.println("enter value:");
                int a=sc.nextInt();
                if(a==0)
                    break;
        }
    }
    
}
